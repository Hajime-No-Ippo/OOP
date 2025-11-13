public class Cat extends Pet implements Adoptable{
    private String color;
    private int keptDays;
    final int legs = 4;

    public Cat(String name, int age, Breed type,int keptDays, String color) {
        super(name, age, Breed.Cat);
        this.keptDays = keptDays;
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }
    
    public String getColor(){
        return color;
    }

    @Override
    public double manualKeptFee() {
        return 20.0 + (keptDays>10 ? 15.0 : 10.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
        System.err.println("Fees in total:" + manualKeptFee());
        if(keptDays>10){
            System.err.println("++++ ADDITIONAL FEES INCLUDED ++++");
        }
    }

    @Override
    public void makeSound(){
        System.out.println("Meow! Meow!");
    }
}