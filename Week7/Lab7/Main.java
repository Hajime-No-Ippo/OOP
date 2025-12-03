package Lab7;

public class Main {
    public static void main(String []args){
        Payment payment1 = new CreditCardPayment(100);
        Payment payment2 = new PayPalPayment(100);
        Payment payment3 = new CreditCardPayment(100);
        Payment payment4 = new PayPalPayment(100);

        System.out.println(payment1.getAmount());
        System.out.println(payment2.getAmount());
        System.out.println(payment3.getAmount());
        System.out.println(payment4.getAmount());

        payment1.appyDiscount(10);
        payment2.appyDiscount(10);
        payment3.appyDiscount(10);
        payment4.appyDiscount(10);

        System.out.println(payment1.process());
        
    }
}
