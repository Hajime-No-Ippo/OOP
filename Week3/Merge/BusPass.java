import java.time.LocalDate;

public class BusPass extends TransportPass{
    public boolean isStudent;
    public double km;
    public double totalFare;
    
    public BusPass (String passId, String ownerName, LocalDate validUntil, boolean isStudent, int km){
        super(passId, ownerName, validUntil);
        this.isStudent = isStudent;
        this.km = km;
    }

    @Override
    public double calculateFare(UsagePolicy policy){
        if(km < 10) totalFare = 3.0;
        else if(km >= 10 && km < 30) totalFare = 5.5;
        else if(km >= 30) totalFare = 10.10;
        if (isStudent) totalFare *= 0.5;
        return totalFare;
    }
}