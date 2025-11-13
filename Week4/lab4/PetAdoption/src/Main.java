import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Adoptable.displayGeneralInfo();

        ArrayList<Pet> pets = new ArrayList<>();
        Cat cat = new Cat("Whiskers", 3, Breed.Cat, 5, "Gray");
        Dog dog = new Dog("Buddy", 4, Breed.Dog, "Golden", 12);
        Bird bird = new Bird("Tweety", 2, "Canary", 8, "Yellow");
        pets.add(cat);
        pets.add(dog);
        pets.add(bird);

        PetUtil.printPetsList(pets);

        System.out.println("Total Adoptable Pets: " + Adoptable.getAdoptableCount());
    }
}
