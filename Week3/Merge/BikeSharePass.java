import java.time.LocalDate;

public class BikeSharePass extends TransportPass{
    public double totalFare;
    public int dayOfRenting;
    
    public BikeSharePass (String passId, String ownerName, LocalDate validUntil, int dayOfRenting){
        super(passId, ownerName, validUntil);
        this.dayOfRenting = dayOfRenting;
    }

    @Override
    public double calculateFare(UsagePolicy policy){
        if(dayOfRenting < 7) totalFare = 3.0;
        else if(dayOfRenting >= 10 && dayOfRenting < 30) totalFare = 2;
        else if(dayOfRenting >= 30) totalFare = 1.2;
        totalFare *= dayOfRenting;
        return totalFare;
    }
}
