package main.view;

import main.model.Animal;
import main.presenter.Registry;

import java.util.List;

public class View {
    public View() {
    }

    public void printCommand(Registry registry) {
        List<Animal> animalsList = registry.getAnimal();
        String command = animalsList.get(animalsList.size() - 1).getCommands();
        System.out.println(command);
    }
}
