package Lab7;

public class CreditCardPayment extends Payment{
    public CreditCardPayment(double amount){
        super(amount);
    }

    @Override
    public String process(){
        return "processing payment from parent class:" + amount;
    }
}
