package main.model.pet;

import main.model.Animal;

import java.util.Date;

public class Pet extends Animal {

    public Pet(Integer id, Date birthdate, String commands) {
        super(id, birthdate, commands);
    }
}
