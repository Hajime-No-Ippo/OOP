//By Mykyta Horbenko 25259002 and Chenming Tao 25251621

import java.time.LocalDate;

public class BusPass extends TransportPass {
    private boolean isStudent; // Student status
    private double km;         // Distance traveled

    //Constructor
    public BusPass(String passId, String ownerName, int age, LocalDate validUntil, boolean isStudent, double km) {
        super(passId, ownerName, age, validUntil);
        this.isStudent = isStudent;
        this.km = km;
    }

    // Getter / Setter
    public boolean isStudent() { return isStudent; }
    public void setStudent(boolean isStudent) { this.isStudent = isStudent; }

    public double getKm() { return km; }
    public void setKm(double km) { this.km = km; }

    // Fare calculation
    @Override
    public double calculateFare(UsagePolicy policy) {
        double totalFare;
        if (km < 10) totalFare = 3.0;
        else if (km < 30) totalFare = 5.5;
        else totalFare = 10.10;

        //Apply student discount
        if (isStudent) totalFare *= 0.5;
        return totalFare;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nStudent: " + isStudent + 
               "\nDistance: " + km + 
               "\nFare: " + calculateFare(null);
    }
}