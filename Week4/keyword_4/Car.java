package keyword_4;

public class Car extends Vehicle implements Rentable {
    private int seats;

    public Car(String brand, VehicalType type, int seats) {
        super(brand, VehicalType.CAR);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public double calculateRentalPrice() {
        return 50.0 + (seats * 5.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
        System.out.println("Rental Prices: $" + calculateRentalPrice() + " per day");
    }
    
    @Override
    public void beepHorn() {
        System.out.println("Beep Beep! This is a car horn.");
    }
}
