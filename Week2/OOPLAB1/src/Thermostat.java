public class Thermostat extends SmartDevice {

    double temperature;

    public Thermostat(int deviceID, String deviceName, String location, double temperature) {
        super(deviceID, deviceName, location);
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return temperature;
    }

}


