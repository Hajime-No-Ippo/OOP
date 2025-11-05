package Lab2;

import java.time.*;

public class BusUsageLimits extends UsagePolicy {
    public BusUsageLimits(String zones, LocalTime startTime,  LocalTime endTime) {
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
