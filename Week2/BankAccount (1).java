package encapsulation_2;

public class BankAccount {
    private String accountHolder;
    public double balance;
    protected String accountType;
    private boolean isFrozen;

    public BankAccount(String accountHolder, double initialBalance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.isFrozen = false;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public boolean isFrozen() {
        return this.isFrozen;
    }

    public void freezeAccount() {
        this.isFrozen = true;
    }
    public void unfreezeAccount() {
        this.isFrozen = false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (!isFrozen && amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }
}
