import java.time.LocalDate;

// This class manages passes: validation and renewal
public class PassManager {

    // Validate if a pass is still valid
    public boolean validatePass(TransportPass pass) {
        if (!pass.isTimeValid()) {
            System.out.println("Pass " + pass.getPassId() + " has expired.");
            return false;
        }
        if (!pass.isAgeValid()) {
            System.out.println("Owner of pass " + pass.getPassId() + " is underage.");
            return false;
        }
        System.out.println("Pass " + pass.getPassId() + " is valid.");
        return true;
    }

    // Renew a pass for a specified number of years
    public void renewPass(TransportPass pass, int years) {
        LocalDate newExpiry = pass.getValidUntil().plusYears(years);
        pass.setValidUntil(newExpiry);
        System.out.println("Pass " + pass.getPassId() + " renewed until " + newExpiry);
    }
}
