package shelter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VirtualPetTest {
    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @Before
    public void setUp() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("name", "description", 100, 100, 100);
        pet2 = new VirtualPet("name", "description", 100, 100, 100);
    }

    @Test
    public void shouldBeAbleToAddPet() {
        underTest.add(pet1);
        //VirtualPet retrievePet = underTest.addPet("name","description", 100,100,100);
        //assertEquals(retrievePet, pet1);

    }
}

