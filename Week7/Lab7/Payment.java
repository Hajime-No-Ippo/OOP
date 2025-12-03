package Lab7;

public class Payment{
    protected double amount;
    public Payment(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public String process(){
        return "processing payment from parent class:" + amount;
    }

    public void appyDiscount(double discount){
        if(discount > 0 && discount < amount){
            amount -= discount;
        }
    }

    public void applyDiscount(double percent){
        if(percent > 0 && percent < 100){
            amount -= (amount * percent / 100);
        }
    }

    public void applyDiscount(){
        amount -= 5;
    }
}
