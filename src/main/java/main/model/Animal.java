package main.model;

import java.util.Date;

public abstract class Animal {
    Integer id;
    Date birthdate;
    String commands;

    public Animal(Integer id, Date birthdate, String commands) {
        this.id = id;
        this.birthdate = birthdate;
        this.commands = commands;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setCommands(String commands) {
        this.commands = commands;
    }
}
