package Lab2;
import java.time.*;

public class TransportPass extends User {


    public TransportPass(User user){
        super(user.passId, user.ownerName, user.validUntil, user.age);
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    public void setPassId(String passId){
        this.passId = passId;
    }

    public void setOwnerName (String ownerName){
        this.ownerName = ownerName;
    }

    public void setValidUntil(LocalDateTime validUntil){
        this.validUntil = validUntil;
    }


    public boolean hasEligibility() {
        if(timeValidate() && ageValidate())
            return true;
        else
            return false;
    }

    public void printEligibility(){
        if(hasEligibility()) {
            System.out.println("\nEligibility of:  \nID: " + this.passId + " \nName: " + this.ownerName + " \nEligibility: " + this.hasEligibility() + " \nEligible till: " + this.validUntil);
        }
        else{
            System.out.println("\nInvalid Eligibility: \nID: " + this.passId + " \nName: " + this.ownerName +  " \nEligibility: " + this.hasEligibility() + " \nUser aged: " +  this.age);
        }
    }

}
