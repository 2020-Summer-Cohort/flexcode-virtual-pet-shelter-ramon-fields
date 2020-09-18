package shelter;

import org.junit.jupiter.api.BeforeEach;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @BeforeEach
    public void setup() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Raphael", "Can be somewhat of a meanie.");
        pet2 = new VirtualPet("Leonardo", "He's a very good boy.");
    }
}
