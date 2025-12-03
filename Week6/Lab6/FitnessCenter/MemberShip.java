import java.time.*;
import java.util.*;

public class MemberShip {
    private UUID uid;
    private String name;
    private LocalDateTime joinedDate;
    private double balance;
    private String location;
    private boolean isActive;

    //Consturctor
    public MemberShip(String name, double balance, String location, boolean isActive){
        this.name = name;
        this.balance = balance;
        this.location = location;
        this.isActive = isActive;
        this.uid = UUID.randomUUID();
    }

    public UUID getId() {
        return uid;
    }

    public void setId(UUID id) {
        this.uid = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDateTime joinedDate){
        this.joinedDate = joinedDate;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String checkStatus(){
        System.out.println("\n=====Checking Status=====");
        if(getBalance() <= 0){
            return "Invalid Balance, no longer available";
        }
        return "Valid status";
    }
    public void chargeBalance(double amount){
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
    }

    public boolean isActive(){
        if(getBalance() == 0){
            return false;
        }
        return true;
    }
}
