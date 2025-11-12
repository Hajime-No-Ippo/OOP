//By Mykyta Horbenko 25259002 and Chenming Tao 25251621

import java.time.LocalDate;

public class BikeSharePass extends TransportPass {
    private int dayOfRenting;
    
    public BikeSharePass(String passId, String ownerName, int age, LocalDate validUntil, int dayOfRenting) {
        super(passId, ownerName, age, validUntil);
        this.dayOfRenting = dayOfRenting;
    }

    public int getDayOfRenting() { 
        return dayOfRenting; 
    }
    public void setDayOfRenting(int dayOfRenting) { 
        this.dayOfRenting = dayOfRenting; 
    }

    @Override
    public double calculateFare(UsagePolicy policy) {
        double baseFare;
        if(dayOfRenting < 7) baseFare = 3.0;
        else if(dayOfRenting < 30) baseFare = 2.0;
        else baseFare = 1.2;

        return baseFare * dayOfRenting;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nDays rented: " + dayOfRenting + 
               "\nFare: " + calculateFare(null);
    }
}