package Lab2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MetroUsageLimits extends UsagePolicy {
    public MetroUsageLimits(String zones, LocalTime startTime, LocalTime endTime) {
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
