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
    protected Registry addAnimal(Animal animal) {
        Registry registry = new Registry(animalList);
        animalList.put(animalList.size() + 1, animal);
        return registry;
    }
    protected Registry teachCommand(Integer id, String text) {
        Registry registry = new Registry(animalList);
        for (Map.Entry<Integer, Animal> entity : animalList.entrySet()) {
            if (entity.getKey().equals(id)) {
                animalList.put(entity.getKey(),
                        entity.getValue().setCommands(entity.getValue().getCommands()+ ", " + text));
            }
        }
        return registry;
    }
    public Map<Integer, Animal> getAnimalList() {
        return animalList;
    }
}
