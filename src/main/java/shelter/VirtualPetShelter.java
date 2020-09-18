package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();
    public Collection<VirtualPet> pets() {
        return pets.values();
    }
    public void add(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }
    //Methods
    public String petStatus() {
        StringBuilder petStatus = new StringBuilder();
        for (Map.Entry<String, VirtualPet> eachPet : pets.entrySet()) {
            petStatus.append(eachPet.getValue().getName()).append("\t").append(eachPet.getValue().getHunger()).append("\t").append(eachPet.getValue().getThirst()).append("\t").append(eachPet.getValue().getBoredom()).append("\n");
        }
        return petStatus.toString();
    }
    public void feedAll() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }
    public void quenchThirstAll() {
        for (VirtualPet pet : pets.values()) {
            pet.quenchThirst();
        }
    }
    public String optionMenu() {
        StringBuilder optionMenu = new StringBuilder();
        for (Map.Entry<String, VirtualPet> eachPet : pets.entrySet()) {
            optionMenu.append("Name: ").append(eachPet.getValue().getName()).append("\t").append(eachPet.getValue().getDescription()).append("\n");
        }
        return optionMenu.toString();
    }
    public void play(String name) {
        pets.get(name).playWith();
    }
    public void adopt(String name) {
        pets.remove(name);
    }
    public boolean containsKey(String name) {
        return pets.containsKey(name);
    }
    public void tickMethod() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }
}

