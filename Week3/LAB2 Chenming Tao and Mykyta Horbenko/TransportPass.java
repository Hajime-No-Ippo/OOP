//By Mykyta Horbenko 25259002 and Chenming Tao 25251621

import java.time.*;

// Base class for all transport passes and owner info
public abstract class TransportPass {
    // Owner and pass info
    private String passId;          // Unique pass ID
    private String ownerName;       // Owner's name
    private int age;                // Owner's age
    private LocalDate validUntil;   // Pass expiry date

    // Constructor
    public TransportPass(String passId, String ownerName, int age, LocalDate validUntil) {
        this.passId = passId;
        this.ownerName = ownerName;
        this.age = age;
        this.validUntil = validUntil;
    }


    // Basic getters and setters

    public String getPassId() {
        return passId;
    }
    public void setPassId(String passId) {
        this.passId = passId;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }
    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }


    // Validation methods
    public boolean isTimeValid() {
        //Check if the pass is still valid
        return LocalDate.now().isBefore(validUntil);
    }

    public boolean isAgeValid() {
        //Check if owner is adult
        return age >= 18;
    }

    // Abstract method for fare calculation
    public abstract double calculateFare(UsagePolicy policy);


    // Display info

    @Override
    public String toString() {
        return "Pass ID: " + passId + "\nOwner: " + ownerName +
               "\nAge: " + age + "\nValid until: " + validUntil;
    }
}