import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();

        // Create specific devices
        Light light1 = new Light(1,"Living Room Light", "Living Room");
        Thermostat thermostat1 = new Thermostat(2,"Hallway Thermostat", "Hallway",26.5);
        Lock doorLock1 = new Lock(3,"Front Door Lock", "Front Door");

        // Register devices
        controller.registerDevice(light1);
        controller.registerDevice(thermostat1);
        controller.registerDevice(doorLock1);


        // Toggle and adjust
        controller.toggleDevice("Living Room Light");
        light1.setBrightness(80);

        controller.toggleDevice("Hallway Thermostat");
        thermostat1.setTemperature(24.5);

        controller.toggleDevice("Front Door Lock");

        // Display all devices
        System.out.println("\n--- Device List ---");
        for (SmartDevice d : controller.listDevices()) {
            System.out.println(d);
        }

        //print the location
        controller.printLocation();

        //get the local time
        LocalDate myObj = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalTime truncated = myTime.withNano(0);

        //print the time and date
        System.out.println("\n===Time Zone===");
        System.out.println("Date: " + myObj + "\nTime: " + truncated);

        //night mode
        controller.nightMode();
        System.out.println("Additional Notice: The night mode would automatically turn on from 18:00 to 6:00");

        //automated night mode
        if(LocalTime.now().getHour()>18 || LocalTime.now().getHour()<6) {
            controller.nightMode();
        }

        controller.tortureMode();

    }
}

