package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter pets = new VirtualPetShelter();

        VirtualPet pet1 = new VirtualPet("Raphael", "Can be somewhat of a meanie.", 100,100,100);
        VirtualPet pet2 = new VirtualPet("Leonardo", "He's a very good boy.", 100, 100, 100);
        VirtualPet pet3 = new VirtualPet("Michelangelo", "Hyper and loves attention.", 100, 100, 100);
        VirtualPet pet4 = new VirtualPet("Donatello", "Smart and friendly.", 100, 100, 100);

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);

        String userChoice = "";
        while (!userChoice.equals("6")) {

            System.out.println("Thank you for volunteering at Master Splinter's Virtual Pet Shelter");
            System.out.println();
            System.out.println("This is the status of our pets:");
            System.out.println();
            System.out.println("Name:   |Hunger |Thirst |Boredom");
            System.out.println("--------|-------|-------|-------");
            System.out.println();
            System.out.println(pets.petStatus());
            System.out.println("What would you like to do next?");
            System.out.println("Press 1 to Feed the pets");
            System.out.println("Press 2 to Quench the thirst of the pets");
            System.out.println("Press 3 to Play with a pet");
            System.out.println("Press 4 to Adopt a pet");
            System.out.println("Press 5 to Admit a pet");
            System.out.println("Press 6 to Quit");
            userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    pets.feedAll();
                    System.out.println("You fed all the pets in the Shelter.");
                    break;
                case "2":
                    pets.quenchThirstAll();
                    System.out.println("You quenched the thirst of all the pets in the Shelter.");
                    break;
                case "3":
                    System.out.println("Which pet would you like to play with?");
                    System.out.println(pets.optionMenu());
                    String petName = input.nextLine();
                    pets.play(petName);
                    System.out.println("You played with " + petName + ".");
                    break;
                case "4":
                    System.out.println("Which pet would you like to adopt?");
                    System.out.println(pets.optionMenu());
                    petName = input.nextLine();
                    if (pets.containsKey(petName)) {
                        pets.adopt(petName);
                        System.out.println("You adopted " + petName + "!");
                    } else {
                        pets.adopt(petName);
                        System.out.println("Sorry no pet here with that name.");
                    }
                    break;
                case "5":
                    System.out.println("What's the name of the pet being admitted?");
                    String newPetName = input.nextLine();
                    System.out.println("Describe the pet being admitted.");
                    String newPetDescription = input.nextLine();
                    pets.add(new VirtualPet(newPetName, newPetDescription));
                    System.out.println("You admitted a pet.");
                    break;
                default:
                    System.out.println("Not an option...");
                    break;
            }
            pets.tickMethod();

        }
        input.close();
    }
}
