package encapsulation_2;

public class SavingsAccount  extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance, "Savings");
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void applyInterest() {
        if (!isFrozen()) {
            double interest = getBalance() * interestRate / 100;
            deposit(interest);
        }
    }

    public void printAccountType() {
        System.out.println("Account type: " + accountType); // accessing protected field
    }
    
}
