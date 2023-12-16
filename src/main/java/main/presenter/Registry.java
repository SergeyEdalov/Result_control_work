package main.presenter;

import main.model.Animal;

import java.util.ArrayList;
import java.util.List;


public class Registry {
    Integer id;
    List<Animal> animal;

    public Registry(Integer id, List<Animal> animal) {
        this.id = id;
        this.animal = animal;
    }
    public Registry() {

    }
    protected void addAnimal(Animal animal) {
        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        Registry registry = new Registry(id++, animals);
    }

    public Integer getId() {
        return id;
    }

    public List<Animal> getAnimal() {
        return animal;
    }
}
