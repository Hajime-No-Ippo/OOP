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
        controller.nightMode();
    }
}

