package keyword_4;
import java.util.ArrayList;

public class VehicleUtils {
    public static void printVehicleDetails(ArrayList<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            v.displayInfo();
            if(v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a car with " + c.getSeats() + " seats.");
            }
            else if(v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a bike. Has carrier: " + b.isHasCarrier());
            }
            System.out.println("-----------------------");
        }

         for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).displayInfo();
            System.out.println("-----------------------");
        }
    }
    
}
