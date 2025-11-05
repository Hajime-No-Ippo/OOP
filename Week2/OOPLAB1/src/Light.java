public class Light extends SmartDevice {
    int brightness;
    public Light(int deviceID, String deviceName, String location) {
        super(deviceID, deviceName, location);
        brightness = 0;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String printStatus() {
        if (brightness == 0){
            return " Brightness off";
        }
        return " Brightness on";
    }
}
