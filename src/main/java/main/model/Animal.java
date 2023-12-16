package main.model;

import java.util.Date;

public abstract class Animal {
    Integer id;
    String type;
    Date birthdate;
    String commands;

    public Animal(Integer id, String type, Date birthdate, String commands) {
        this.id = id;
        this.type = type;
        this.birthdate = birthdate;
        this.commands = commands;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
