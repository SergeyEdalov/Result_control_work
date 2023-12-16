package main.view;

import main.model.Animal;
import main.presenter.Registry;
import java.util.Map;

public class View {
    public View() {
    }

    public void printCommand(Registry registry) {
        Map<Integer, Animal> animalsList = registry.getAnimalList();
        String command = animalsList.get(animalsList.size() - 1).getCommands();
        System.out.println(command);
    }
}
