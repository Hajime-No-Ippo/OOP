public class Dog extends Pet implements Adoptable{
    private String fluffColor;
    private int keptDays;
    final int legs = 4;

    public Dog(String name, int age, Breed breed, String fluffColor, int keptDays) {
        super(name, age, Breed.Dog);
        this.fluffColor = fluffColor;
        this.keptDays = keptDays;
    }

    public String getFluffColor() {
        return fluffColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fluff Color: " + fluffColor);
        System.err.println("Fees in total:" + manualKeptFee());
        if(keptDays>10){
            System.err.println("++++ ADDITIONAL FEES INCLUDED ++++");
        }
    }   

    @Override
    public void makeSound() {
        System.out.print("Woof! Woof!");
    }

    @Override
    public double manualKeptFee() {
        return 20.0 + (keptDays>10 ? 10.0 : 5.0);
    }

}