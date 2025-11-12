//By Mykyta Horbenko 25259002 and Chenming Tao 25251621

import java.time.LocalDate;

public class MetroPass extends TransportPass {
    private boolean isStudent;   // Student status
    private double fare;         // Base fare

    // Constructor
    public MetroPass(String passId, String ownerName, int age, LocalDate validUntil, boolean isStudent) {
        super(passId, ownerName, age, validUntil);
        this.isStudent = isStudent;
        this.fare = 1.5; // Default fare
    }

    public boolean isStudent() { 
        return isStudent; 
    }
    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent; 
    }

    public double getFare() { 
        return fare; 
    }
    public void setFare(double fare) { 
        this.fare = fare; 
    }

    @Override
    public double calculateFare(UsagePolicy policy) {
        // Calculate fare correctly with student discount
        double totalFare = fare;
        if (isStudent) totalFare *= 0.5; // Apply 50% discount for students
        return totalFare;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nStudent: " + isStudent +
               "\nFare: " + calculateFare(null);
    }
}