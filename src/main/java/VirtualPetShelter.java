import java.util.HashMap;
import java.util.Map;

    public class VirtualPetShelter {

        Map<String, VirtualPet> pets = new HashMap<>();

        public void add(VirtualPet pet) {
            pets.put(pet.getName(), pet);
        }

        //Methods
        //public void petStatus() {
        //}

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

        //public String optionMenu() {
            //for (VirtualPet pet : pets.values()) {
                //pet.getDescription();
            //}return optionMenu();
        //}

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