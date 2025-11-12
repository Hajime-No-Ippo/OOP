//By Mykyta Horbenko 25259002 and Chenming Tao 25251621

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UsagePolicy {
    public String zones;
    public LocalTime startTime;
    public LocalTime endTime;

    public UsagePolicy(String zones, LocalTime startTime, LocalTime endTime) {
        this.zones = zones;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //Getter and Setters
    public String getZones() {
        return zones;
    }
    public void setZones(String zones) {
        this.zones = zones;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    // Judging if it is peaking hours now
    public boolean isPeakHour() {
        return LocalTime.now().isAfter(startTime) && LocalTime.now().isBefore(endTime);
    }

    //CalculateFare in different baseFare based on Zones
    public double calculateFare() {
        double baseFare;

        // Choose base fare depending on zone (transport type)
        switch (getZones().toLowerCase()) {
            case "red":   baseFare = 2.00; break;   // Bike
            case "green": baseFare = 3.00; break;   // Bus
            case "blue":  baseFare = 2.50; break;   // Metro
            default:      baseFare = 0.00; break;   // Error
        }

        // Apply 50% peak hour increase
        if (isPeakHour()) {
            baseFare *= 1.5;
        }

        // Apply 20% weekend discount
        DayOfWeek today = LocalDateTime.now().getDayOfWeek();
        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            baseFare *= 0.8;
        }

        return Math.round(baseFare * 100.0) / 100.0;
    }
    // Printing Methods
    public void printMethods(){
        if(isPeakHour() && getZones().toLowerCase().equals("red")) {
            System.out.println("Bike Peak Hour starts from " + getStartTime() + " to " + getEndTime()+"\nYou need to pay "+ calculateFare());
        }
        else if(isPeakHour() && getZones().toLowerCase().equals("green")) {
            System.out.println("Bus Peak Hour starts from " + getStartTime() + " to " + getEndTime()+"\nYou need to pay "+ calculateFare());
        }
        else if(isPeakHour() && getZones().toLowerCase().equals("blue")) {
            System.out.println("Metro Peak Hour starts from " + getStartTime() + " to " + getEndTime()+"\nYou need to pay "+ calculateFare());
        }
        else {
            System.out.println("It is not peak hours in " + getZones()+" zone now. \nYou need to pay "+ calculateFare() +" euro.");
        }
    }
}
