import java.util.*;


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
        System.out.println("\n===Night Mode is ON===");
        for (SmartDevice SmartDevice : devices) {
            if (SmartDevice instanceof Light light1) {
                light1.setBrightness(0);
                System.out.println("NightMode activate: " + light1.getDeviceName() + light1.printStatus());
            }else if(SmartDevice instanceof Lock doorlock) {
                doorlock.setIsLocked(true);
                System.out.println("NightMode activate: " + doorlock.getDeviceName() + doorlock.printStatus());
            }
        }
    }

    //Randomly torture your prisoner here
    public void tortureMode() {
        System.out.println("\n===Torture Mode is ON===");
        System.out.println("Tell me the passcode between 0-10!");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int passcode = input.nextInt();
        int score = rand.nextInt(10);
        while (true) {
            if(passcode > 10 || passcode < 0) {
                System.out.println("Tell me the passcode between 0-10!");
            }else{
                if(passcode == score) {
                    System.out.println("You lucky boy");
                    break;
                }else{
                    for (SmartDevice SmartDevice : devices) {
                        if (SmartDevice instanceof Light light1) {
                            light1.setBrightness(0);
                            System.out.println("TortureMode activate: " + light1.getDeviceName() + light1.printStatus());
                        } else if (SmartDevice instanceof Lock doorlock) {
                            doorlock.setIsLocked(true);
                            System.out.println("TortureMode activate: " + doorlock.getDeviceName() + doorlock.printStatus());
                        } else if (SmartDevice instanceof Thermostat Thermostat) {
                            Thermostat.setTemperature(75.0);
                            System.out.println("TortureMode activate: " + Thermostat.getDeviceName() + "\n === Temperature set to: === " + "\n" + Thermostat.getTemperature());
                        }
                    }
                    break;
                }
            }
        }
    }

    //Render the location of the SmartDevices
    public void printLocation(){
        System.out.println("\n=== The Location of your Smart Devices ===");
        for (SmartDevice SmartDevice : devices) {
            if (SmartDevice instanceof Light light1) {
                System.out.println("Device ID: " + light1.getDeviceId() + "\nDevice Name: "+light1.getDeviceName()+"\nDevice location: "+ light1.getLocation());
            }else if(SmartDevice instanceof Lock doorlock){
                System.out.println("Device ID: " + doorlock.getDeviceId() + "\nDevice Name: "+doorlock.getDeviceName()+"\nDevice location: "+ doorlock.getLocation());
            }else if(SmartDevice instanceof Thermostat Thermostat){
                System.out.println("Device ID: " + Thermostat.getDeviceId() + "\nDevice Name: "+Thermostat.getDeviceName()+"\nDevice location: "+ Thermostat.getLocation());
            }
        }
    }

    public List<SmartDevice> listDevices() {
        return devices;
    }
}
