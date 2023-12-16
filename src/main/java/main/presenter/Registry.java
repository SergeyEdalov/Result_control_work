package main.presenter;

import main.model.Animal;
import main.model.pet.Cat;
import main.model.pet.Dog;
import main.model.pet.Hamster;

import java.util.Scanner;

public class Registry {
    Integer id;
    Animal animal;

    public Registry(Integer id, Animal animal) {
        this.id = id;
        this.animal = animal;
    }

    protected void addAnimal(Animal animal) {
    Registry registry = new Registry(id++, animal);
    }
}
