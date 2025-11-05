package Lab2;

import java.time.LocalTime;

public class BikeShareUsageLimits extends UsagePolicy {
    public BikeShareUsageLimits(String zones, LocalTime startTime, LocalTime endTime) {
        super(zones,startTime,endTime);
    }

    @Override
    public double calculateFare(){
        return super.calculateFare();
    }
    @Override
    public void printMethods() {
        super.printMethods();
    }
}
