package Lab2;
import java.time.*;

public class User {
    public String passId;
    public String ownerName;
    public LocalDateTime validUntil;
    public int age;

    public User(String passId, String ownerName, LocalDateTime validUntil,  int age) {
        this.passId = passId;
        this.ownerName = ownerName;
        this.validUntil = validUntil;
        this.age = age;
    }

    public boolean timeValidate() {
        LocalDateTime now = LocalDateTime.now();
        return now.isBefore(validUntil);
    }

    public boolean ageValidate() {
        return age >= 18;
    }


    public String getPassId() {
        return passId;
    }
}
