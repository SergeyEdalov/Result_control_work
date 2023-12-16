select * from animals;
-- Удалить записи о верблюдах и объединить таблицы лошадей и ослов
delete from animals 
where type_animal = 'Camel';

select * from animals 
where type_animal = 'Horse' or type_animal = 'Donkey';


-- Создать новую таблицу для животных в возрасте от 1 до 3 лет 
drop table if exists young_animals;
DROP PROCEDURE IF EXISTS table_young_animals;

DELIMITER //
	
CREATE PROCEDURE table_young_animals()
begin
	create table young_animals like animals;
	insert into young_animals select * from animals
	where (birthdate between CURDATE() - INTERVAL 3 year and CURDATE() - INTERVAL 1 year); 
	
	ALTER TABLE young_animals Rename COLUMN id to animals_id;
	ALTER TABLE young_animals MODIFY animals_id BIGINT unsigned not null, drop primary key;
	ALTER TABLE young_animals add column id BIGINT UNSIGNED NOT NULL auto_increment primary key first;
	ALTER TABLE young_animals add foreign key (animals_id) references animals(id);

	select * from young_animals;
END//

DELIMITER ;

call table_young_animals();

-- вычислить возраст с точностью до месяца
select *, CONCAT((TIMESTAMPDIFF(year, birthdate, NOW())), ' года ',
    (TIMESTAMPDIFF(month, birthdate, NOW()) - 
    TIMESTAMPDIFF(year, birthdate, NOW())* 12), ' месяцев ') as age
from young_animals;


-- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.
select animals.*, young_animals.*
from animals
left join young_animals on animals.id = young_animals.animals_id
union 
select animals.*, young_animals.*
from animals
right join young_animals on animals.id = young_animals.animals_id;








