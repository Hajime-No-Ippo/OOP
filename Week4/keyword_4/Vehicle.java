package keyword_4;

abstract class Vehicle {
    private String brand;
    final int MAX_SPEED = 200;
    private String licensePlate;
    private final String VIN = "1HGBH41JXMN109186";
    static int vehicleCount = 0;

    public Vehicle(String brand, VehicalType type) {
        this.brand = brand;
        this.licensePlate = brand + "-" + vehicleCount;
        vehicleCount++;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }   

    public final int getMaxSpeed() {
        return MAX_SPEED;
    }
    
    public abstract double calculateRentalPrice();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("VIN: " + VIN);
        System.out.println("Max Speed: " + MAX_SPEED + " km/h");
    }
}