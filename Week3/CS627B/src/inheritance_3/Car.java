package inheritance_3;

public class Car extends Vehicle{
    public Car(String make, String model, int year, Engine engine){
        super(make, model, year);
        this.engine = engine;
    }

    @Override
    public void start(){}
    public void stop(){}
}
