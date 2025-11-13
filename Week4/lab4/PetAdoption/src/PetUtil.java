import java.util.ArrayList;

public class PetUtil {
    public static void printPetsList(ArrayList<Pet> pets) {
        for (Pet pet : pets) {
            pet.displayInfo();

            if(pet instanceof Cat c) {
                Cat cat = (Cat) pet;
                System.out.println("Color: " + c.getColor());
            } else if (pet instanceof Dog d) {
                System.out.println("Fluff Color: " + d.getFluffColor());
            } else if (pet instanceof Bird) {
                Bird bird = (Bird) pet;
                System.out.println("Colour: " + bird.getColour());
            }

            
            System.out.println("-----------------------");
        }
    }

}

