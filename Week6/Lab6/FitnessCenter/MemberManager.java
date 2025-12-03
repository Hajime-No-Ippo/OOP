import java.lang.reflect.Member;
import java.time.*;
import java.util.*;

public class MemberManager extends MemberShip {
    public MemberManager(String name, double balance, String location, boolean isActive){
        super(name, balance, location, isActive);
    }

    @Override
    public void chargeBalance(double amount){}

    @Override
    public boolean isActive(){
        if(getBalance() == 0){
        return false;
    }
        return true;
    }
}
