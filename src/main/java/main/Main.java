package main;

import main.model.Controller.Controller;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Controller controller = new Controller();
        controller.workMenu();
    }
}