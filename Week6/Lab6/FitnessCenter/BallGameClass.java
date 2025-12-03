import java.time.DayOfWeek;
import java.time.LocalDate;

public class BallGameClass extends BookingService implements Bookable{
    private double fees = 12.0;
    protected String description = "This class will teach you basic rules on how to play some common ball games like basketball or soccer";
    public BallGameClass(String cId, String className, MemberShip member){
        super(cId,className);
        this.fees = fees;
        this.description = description;
        this.member = member;
    }

    @Override
    public double getFee(){
        return fees;
    }

    //Get description from each child class.
    @Override
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

