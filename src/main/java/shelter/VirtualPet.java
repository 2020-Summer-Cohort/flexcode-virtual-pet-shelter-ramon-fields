package shelter;

public class VirtualPet {
    //Fields
    private final String name;
    private final String description;
    private int hunger;
    private int thirst;
    private int boredom;
    //Getters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public VirtualPet(String name, String description) {
        this(name, description,25 , 25, 50);
    }
    public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }
    //Methods
    public void feed() {
        this.hunger -= 25;
    }
    public void quenchThirst() {
        this.thirst -= 25;
    }
    public void playWith() {
        this.boredom -= 25;
    }
    public void tick() {
        this.hunger++;
        this.thirst++;
        this.boredom++;
    }
}
