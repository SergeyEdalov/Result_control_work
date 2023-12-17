package main.model.Controller;

import main.model.Animal;
import main.presenter.Data;
import main.presenter.Registry;
import main.view.View;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    Map<Integer, Animal> animalList = new HashMap<>();
    private final Registry registry = new Registry(animalList);
    private final View view = new View();
    private final Data data = new Data();

    public Controller() {
    }

    public void workMenu() throws ParseException {
        int button;
        while (true) {
            view.printMenu();
            button = data.getCountMenuFromUser();
            switch (button) {
                case (1):
                    registry.addAnimal(registry, data.getAnimalFromUser());
                    break;
                case (2):
                    view.printCommand(registry);
                    break;
                case (3):
                    registry.teachCommand(registry, data.getIdFromUser(), data.getCommandFromUser());
                    break;
                case (4):
                    view.printSortRegistry(registry.sortRegistry(registry));
                    break;
                case (0):
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + button);
            }
            if (button == 0) {
                break;
            }
        }
    }
}
