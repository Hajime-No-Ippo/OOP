public class Bird extends Pet implements Adoptable{
    private String colour;
    private int keptDays;
    final int legs = 2;
    private boolean needSpecialCare;

    public Bird(String name, int age, String breed, int keptDays, String colour) {
        super(name,age, Breed.Bird);
        this.colour = colour;
        this.keptDays = keptDays;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double manualKeptFee() {
        return 20.0 + (needSpecialCare && keptDays > 10 ? 8.0 : 7.0);
    }

    @Override
    public void makeSound(){
        System.out.println("Tweet! Tweet!");
        
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Colour: " + colour);
        System.err.println("Fees in total:" + manualKeptFee());
        if(keptDays>10 && needSpecialCare){
            System.err.println("++++ ADDITIONAL FEES INCLUDED ++++");
        }
    }   
}