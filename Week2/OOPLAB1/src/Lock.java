import java.sql.SQLOutput;

public class Lock extends SmartDevice {
    boolean isLocked;
    public Lock(int deviceID, String deviceName, String location) {
        super(deviceID, deviceName, location);
        isLocked = false;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String printStatus(){
        if(isLocked){
           return " Locked on";
        }
        return "";
    }
}
