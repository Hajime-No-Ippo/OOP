public class SmartDevice {
    // Private fields
    public String deviceName;
    private boolean status; // true = ON, false = OFF
    private String location;
    private int deviceID;

    // Constructor
    public SmartDevice(int deviceID, String deviceName, String location) {
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.location = location;
        this.status = false; // Default to OFF
    }

    // Getters
    public int getDeviceId() {return deviceID;}

    public String getDeviceName() {
        return deviceName;
    }

    public boolean isOn() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setDeviceID(int deviceID) {this.deviceID = deviceID;
        System.out.println(" Set Device ID ." + deviceName);}

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Methods to turn on/off the device
    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is now ON.");
    }

    public void turnOff() {
        status = false;
        System.out.println(deviceName + " is now OFF.");
    }

    @Override
    public String toString() {
        return "Device Name: " + deviceName +
                ", Location: " + location +
                ", Status: " + (status ? "ON" : "OFF");
    }
}

