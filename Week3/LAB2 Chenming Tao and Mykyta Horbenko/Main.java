//By Mykyta Horbenko 25259002 and Chenming Tao 25251621

import java.time.*;

public class Main {
    public static void main(String[] args) {

        // Create TransportPasses
        TransportPass metroPass = new MetroPass("03jf23", "Mykyta", 27, LocalDate.of(2026, 2, 6), true);
        TransportPass busPass = new BusPass("2728MN213", "Eric", 21, LocalDate.of(2027, 4, 5), true, 31);
        TransportPass bikePass = new BikeSharePass("BK001", "Max", 35, LocalDate.of(2025, 12, 31), 5);

        System.out.println("!!! Transport Pass Info ");
        System.out.println(metroPass);
        System.out.println("");
        System.out.println(busPass);
        System.out.println("");
        System.out.println(bikePass);


        //Check eligibility (age & validUntil)
        TransportPass[] passes = {metroPass, busPass, bikePass};

        System.out.println("\n!!! Pass Eligibility ");
        for (TransportPass pass : passes) {
            System.out.println(pass.getOwnerName() + ": " + ((pass.isTimeValid() && pass.isAgeValid()) ? "Eligible" : "Not eligible"));
        }

        //Define Usage Policies
        UsagePolicy metroPolicy = new UsagePolicy("Blue", LocalTime.of(4, 0), LocalTime.of(6, 0));
        UsagePolicy busPolicy = new UsagePolicy("Green", LocalTime.of(5, 0), LocalTime.of(7, 0));
        UsagePolicy bikePolicy = new UsagePolicy("Red", LocalTime.of(6, 0), LocalTime.of(8, 0));

        System.out.println("\n!!! Peak Hour Fare Info ");
        metroPolicy.printMethods();
        busPolicy.printMethods();
        bikePolicy.printMethods();


        //Validate and renew passes
        PassManager manager = new PassManager();
        System.out.println("\n!!! Pass Validation and Renewal ");
        for (TransportPass pass : passes) {
            manager.validatePass(pass);
        }

        // Renew metro pass for 1 year
        manager.renewPass(metroPass, 1);


        // Track usage logs
        UsageLog metroLog = new UsageLog(metroPass);
        UsageLog busLog = new UsageLog(busPass);
        UsageLog bikeLog = new UsageLog(bikePass);

        metroLog.addTrip("Morning commute");
        metroLog.addTrip("Evening shopping");

        busLog.addTrip("Office commute");
        busLog.addTrip("Gym visit");

        bikeLog.addTrip("Park ride");
        bikeLog.addTrip("Weekend trip");

        System.out.println("\n!!! Usage Logs ");
        metroLog.printLog();
        busLog.printLog();
        bikeLog.printLog();
    }
}
