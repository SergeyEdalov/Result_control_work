package main.model;

import java.util.Date;

public abstract class Animal {
    String name;
    Date birthdate;
    String commands;

    public Animal(String name, Date birthdate, String commands) {
        this.name = name;
        this.birthdate = birthdate;
        this.commands = commands;
    }

    public Animal() {

    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCommands() {
        return commands;
    }

    public Animal setCommands(String commands) {
        this.commands = commands;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
