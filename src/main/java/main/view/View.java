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

    public void printSortRegistry(Registry registry) {
        for (Map.Entry<Integer, Animal> entity : registry.getAnimalList().entrySet()) {
            System.out.println(entity.getKey() + " " + entity.getValue().toString());
        }
    }

    public void printMenu() {
        System.out.println("Меню");
        System.out.println(" 1 - добавить животное в реестр\n 2 - посмотреть команду животного\n " +
                "3 - добавить команду животному\n 4 - вывести список животных по дате рождения\n 0 - выход");
    }
}
