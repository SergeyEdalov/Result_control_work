package main.presenter;

import main.model.Animal;

import java.util.Map;


public class Registry {

    Map<Integer, Animal> animalList;

    public Registry(Map<Integer, Animal> animalList) {
        this.animalList = animalList;
    }

    public Registry() {

    }

    public Registry addAnimal(Registry registry, Animal animal) {
        registry.animalList.put(animalList.size() + 1, animal);
        System.out.println("Животное добавлено в реестр");
        return registry;
    }

    public Registry teachCommand(Registry registry, Integer id, String text) {
        for (Map.Entry<Integer, Animal> entity : animalList.entrySet()) {
            if (entity.getKey().equals(id)) {
                animalList.put(entity.getKey(),
                        entity.getValue().setCommands(entity.getValue().getCommands() + ", " + text));
            }
        }
        System.out.println("Команда добавлена");
        return registry;
    }

    public Map<Integer, Animal> getAnimalList() {
        return animalList;
    }

    public Registry sortRegistry(Registry registry) {

        return registry;
    }
}
