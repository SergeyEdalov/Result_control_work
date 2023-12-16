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

    String requestTypeAnimal = "Enter type animal: ";
    String requestNameAnimal = "Enter name animal: ";
    String requestBirthdateAnimal = "Enter birthdate animal: ";
    String requestCommandAnimal = "Enter command animal: ";

    public Animal getAnimalFromUser() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("d MMMM yyyy года");
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal(){};

        System.out.println(requestTypeAnimal);
        String typeAnimal = scanner.next();

        System.out.println(requestNameAnimal);
        String nameAnimal = scanner.next();

        System.out.println(requestBirthdateAnimal);
        String birthdateAnimal = scanner.next();
        Date date = format.parse(birthdateAnimal);

        System.out.println(requestCommandAnimal);
        String commandAnimal = scanner.next();
        switch (typeAnimal) {
            case ("Dog") -> animal = new Dog(nameAnimal, date, commandAnimal);
            case ("Cat") -> animal = new Cat(nameAnimal, date, commandAnimal);
            case ("Hamster") -> animal = new Hamster(nameAnimal, date, commandAnimal);
            case ("Horse") -> animal = new Horse(nameAnimal, date, commandAnimal);
            case ("Camel") -> animal = new Camel(nameAnimal, date, commandAnimal);
            case ("Donkey") -> animal = new Donkey(nameAnimal, date, commandAnimal);
            default -> throw new IllegalStateException("Unexpected value: " + typeAnimal);
        }
        return animal;
    }
    public String getCommandFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.println(requestCommandAnimal);
        String commandAnimal = scanner.next();
        return commandAnimal;
    }

    public Integer getIdFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.println(requestCommandAnimal);
        Integer idAnimal = scanner.nextInt();
        return idAnimal;
    }
}
