import java.time.LocalDate;

public class MetroPass extends TransportPass{
    public boolean isStudent;
    public double fare = 1.5;

    public MetroPass(String passId, String ownerName, LocalDate validUntil, boolean isStudent, double fare){
        super(passId, ownerName, validUntil);
        this.isStudent = isStudent;
        this.fare = fare;
    }

    @Override
    public double calculateFare(UsagePolicy policy){
        double totalFare = fare;
        if (isStudent) fare *= 0.5;
        return totalFare;
    }
}
