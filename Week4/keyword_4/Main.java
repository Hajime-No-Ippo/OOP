package keyword_4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rentable.displayWelcomeMessage();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car car2 = new Car("Honda", VehicalType.CAR, 5);
        Bike bike1 = new Bike("Yamaha", VehicalType.BIKE, false);

        vehicles.add(car2);
        vehicles.add(bike1);
        vehicles.add(new Car("Ford", VehicalType.TRUCK, 3));
        vehicles.add(new Bike("Ducati", VehicalType.BIKE, true));

        vehicles.get(2).displayInfo();
        System.out.println("-----------------------");

        System.out.println("Vehicle 1 Info:");
        car2.displayInfo();
        car2.showRentalTerm();
        car2.beepHorn();

        System.out.println("\nVehicle 2 Info:");
        bike1.displayInfo();
        bike1.showRentalTerm();
        bike1.beepHorn();

        
        // Accessing static variable directly using class name
        System.out.println("Total vehicles created: " + Vehicle.vehicleCount);
    }
}
