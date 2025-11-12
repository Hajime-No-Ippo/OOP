package keyword_4;

public class Bike extends Vehicle implements Rentable {
    private boolean hasCarrier;

    public Bike(String brand, VehicalType type, boolean hasCarrier) {
        super(brand, VehicalType.BIKE);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public double calculateRentalPrice() {
        return 20.0 + (hasCarrier ? 15.0 : 10.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
        System.out.println("Rental Prices: $" + calculateRentalPrice() + " per day");
    }

    @Override
    public void beepHorn() {
        System.out.println("Ring Ring! This is a bike horn.");
    }
    
}
