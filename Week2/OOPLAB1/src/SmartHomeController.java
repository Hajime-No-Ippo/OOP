import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices;

    public SmartHomeController() {
        devices = new ArrayList<>();
    }

    public void registerDevice(SmartDevice d) {
        devices.add(d);
        System.out.println("Registered device: " + d.getDeviceName());
    }

    public void toggleDevice(String deviceName) {
        for (SmartDevice d : devices) {
            if (d.getDeviceName().equalsIgnoreCase(deviceName)) {
                if (d.isOn()) {
                    d.turnOff();
                } else {
                    d.turnOn();
                }
                return;
            }
        }
        System.out.println("Device \"" + deviceName + "\" not found.");
    }

    public void nightMode() {
        System.out.println("===Night Mode is ON===");
        for (SmartDevice SmartDevice : devices) {
            if (SmartDevice instanceof Light light1) {
                light1.setBrightness(0);
                System.out.println("NightMode activate: " + light1.getDeviceName());
            }else if(SmartDevice instanceof Lock doorlock) {
                doorlock.setIsLocked(true);
                System.out.println("NightMode activate: " + doorlock.getDeviceName());
            }
        }
    }

    public List<SmartDevice> listDevices() {
        return devices;
    }
}
