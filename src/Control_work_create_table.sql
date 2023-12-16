
-- Создать таблицы, соответствующие иерархии из вашей диаграммы классов

DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;

DROP TABLE IF EXISTS animals;
CREATE TABLE animals (
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    class VARCHAR (20),
    type_animal VARCHAR(20),
    birthdate DATE,
    commands VARCHAR(120)
    );
-- Заполнить таблицы данными о животных, их командах и датами рождения
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (1, 'Fido', 'Pets', 'Dog', '2020-01-01', 'Sit, Stay, Fetch');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (2, 'Whiskers', 'Pets', 'Cat', '2019-05-15', 'Sit, Pounce');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (3, 'Hammy', 'Pets', 'Hamster', '2021-03-10', 'Roll, Hide');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (4, 'Buddy', 'Pets', 'Dog', '2018-12-10', 'Sit, Paw, Bark');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (5, 'Smudge', 'Pets', 'Cat', '2020-02-20', 'Sit, Pounce, Scratch');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (6, 'Peanut', 'Pets', 'Hamster', '2021-08-01', 'Roll, Spin');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (7, 'Bella', 'Pets', 'Dog', '2019-11-11', 'Sit, Stay, Roll');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (8, 'Oliver', 'Pets', 'Cat', '2020-06-30', 'Meow, Scratch, Jump');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (9, 'Thunder', 'PackAnimals', 'Horse', '2015-07-21', 'Trot, Canter, Gallop');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (10, 'Sandy', 'PackAnimals', 'Camel', '2016-11-03', 'Walk, Carry Load');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (11, 'Eeyore', 'PackAnimals', 'Donkey', '2017-09-18', 'Walk, Carry Load, Bray');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (12, 'Storm', 'PackAnimals', 'Horse', '2014-05-05', 'Trot, Canter');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (13, 'Dune', 'PackAnimals', 'Camel', '2018-12-12', 'Walk, Sit');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (14, 'Burro', 'PackAnimals', 'Donkey', '2019-01-23', 'Walk, Bray, Kick');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (15, 'Blaze', 'PackAnimals', 'Horse', '2016-02-29', 'Trot, Jump, Gallop');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (16, 'Sahara', 'PackAnimals', 'Camel', '2015-08-14', 'Walk, Run');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (17, 'Ben', 'PackAnimals', 'Horse', '2022-12-12', 'Canter');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (18, 'Olga', 'Pets', 'Cat', '2022-05-02', 'Scratch, Jump');
INSERT INTO `animals` (`id`, `name`, `class`, `type_animal`, `birthdate`, `commands`) VALUES (19, 'Boris', 'Pets', 'Hamster', '2023-02-14', 'Spin');














