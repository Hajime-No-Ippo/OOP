abstract class Pet {
    private String name;
    private int age;
    private Breed breed;
    final int MAX_AGE = 100;
    static int petCount = 1;

    public Pet(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        petCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getMaxAge() {
        return MAX_AGE;
    }

    final String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed + ", MAX_AGE: " + MAX_AGE;
    }
    
    public static int getPetCount() {
        return petCount-1;
    }

    public abstract double manualKeptFee();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("MAX_AGE: " + MAX_AGE);
    }
    
}
