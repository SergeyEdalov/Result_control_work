package main.presenter;

import main.model.Animal;
import main.model.packAnimal.Camel;
import main.model.packAnimal.Donkey;
import main.model.packAnimal.Horse;
import main.model.pet.Cat;
import main.model.pet.Dog;
import main.model.pet.Hamster;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {
    public Data() {

    }

    String requestTypeAnimal = "Введите тип животного: ";
    String requestNameAnimal = "Введите имя животного: ";
    String requestBirthdateAnimal = "Введите дату рождения животного: ";
    String requestCommandAnimal = "Введите команду животного: ";
    String requestIdAnimal = "Введите номер животного: ";
    String requestCountMenu = "Введите пункт меню: ";


    public Animal getAnimalFromUser() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println(requestTypeAnimal);
        String typeAnimal = scanner.next();

        System.out.println(requestNameAnimal);
        String nameAnimal = scanner.next();

        System.out.println(requestBirthdateAnimal);
        String birthdateAnimal = scanner.next();
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(birthdateAnimal);

        System.out.println(requestCommandAnimal);
        String commandAnimal = scanner.next();
        switch (typeAnimal) {
            case ("Собака") -> animal = new Dog(nameAnimal, date, commandAnimal);
            case ("Кот") -> animal = new Cat(nameAnimal, date, commandAnimal);
            case ("Хомяк") -> animal = new Hamster(nameAnimal, date, commandAnimal);
            case ("Лошадь") -> animal = new Horse(nameAnimal, date, commandAnimal);
            case ("Верблюд") -> animal = new Camel(nameAnimal, date, commandAnimal);
            case ("Осёл") -> animal = new Donkey(nameAnimal, date, commandAnimal);
            default -> throw new IllegalStateException("Неожиданное значение: " + typeAnimal);
        }
        return animal;
    }

    public String getCommandFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(requestCommandAnimal);
        String commandAnimal = scanner.next();
        return commandAnimal;
    }

    public Integer getIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(requestIdAnimal);
        Integer idAnimal = scanner.nextInt();
        return idAnimal;
    }

    public int getCountMenuFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(requestCountMenu);
        int count = scanner.nextInt();
        return count;
    }
}
