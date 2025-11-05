package Lab2;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        User FG = new User("makima001","Frank Gallagher", LocalDateTime.of(2025, 12, 31, 23, 59), 65);
        User KD = new User("sigma002","Kevin Durant", LocalDateTime.of(2025, 12, 31, 23, 59),12);
        User CK = new User("alpha003","Calvin Kassie", LocalDateTime.of(2025, 12, 31, 23, 59),22);

        System.out.println("**** Qualified Users ****");
        new TransportPass(FG).printEligibility();
        new TransportPass(KD).printEligibility();
        new TransportPass(CK).printEligibility();

        System.out.println("\n**** Peaking Hours Regularly ****\n");
        MetroUsageLimits metroPolicy = new MetroUsageLimits("Red", LocalTime.of(4,0),LocalTime.of(6,0));
        BusUsageLimits busPolicy = new BusUsageLimits("Green", LocalTime.of(5,0),LocalTime.of(7,0));
        BikeShareUsageLimits bikePolicy = new BikeShareUsageLimits("Blue", LocalTime.of(6,0),LocalTime.of(8,0));

        bikePolicy.printMethods();
        busPolicy.printMethods();
        metroPolicy.printMethods();




    }
}
