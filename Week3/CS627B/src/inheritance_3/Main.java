package inheritance_3;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(300, "V6");
        Car car = new Car("Toyota", "Camry", 2000, carEngine);
        Engine motorEngine = new Engine(400, "Gasoline");
        ElectricCar electricCar = new ElectricCar("Tesla", "model3",2010, battery);
        car.start();
        car.stop();
    }
}
