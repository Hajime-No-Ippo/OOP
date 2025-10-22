public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountHolder, double initialBalance, double interestRate){
        super(accountHolder, initialBalance, accountType:"Savings");
        this.interestRate = interestRate;
    }
}
