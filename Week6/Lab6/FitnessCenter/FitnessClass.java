import java.time.DayOfWeek;
import java.time.LocalDate;

public class FitnessClass extends BookingService implements Bookable{
    private double fees = 8.0;
    protected String description = "The deadlift is a strength training exercise where a weighted barbell is lifted from the floor to a standing position and then returned to the floor.";
    public FitnessClass(String cId, String className, MemberShip member){
        super(cId,className);
        this.fees = fees;
        this.description = description;
        this.member = member;
    }

    public double getFee(){
        return fees;
    }

    //Get description from each child class.
    public String getDescription(){
        return description;
    }

    public String getClassName(){
        return className;
    }

    //Discount on Weekend, charge fees from member's balance. Charged when child class was selected
    public void chargeFee(){
        double finalFee = this.fees;
        // Weekend discount
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            finalFee = finalFee * 0.8;  // 20% discount
        }

        // Deduct balance
        double newBalance = member.getBalance() - finalFee;
        member.setBalance(newBalance);

    }

    public void printFee(){
        System.out.println("\n====="+getClassName()+"=====");
        System.out.println(getDescription());
        System.out.println("Class fee: " + this.fees);
        System.out.println("Current balance: " + member.getBalance());
        System.out.println(member.checkStatus());
    }
}

