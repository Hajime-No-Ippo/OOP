package encapsulation_2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0, "Savings");

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println("Account Type: " + account.getAccountType());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.freezeAccount();
        account.withdraw(100.0); // This should not change the balance
        System.out.println("Balance after attempting withdrawal from frozen account: " + account.getBalance());

        account.unfreezeAccount();
        account.withdraw(100.0);
        System.out.println("Balance after withdrawal from unfrozen account: " + account.getBalance());

        BankAccount account214 = new BankAccount("Bob", 20.0, "Savings");

        System.out.println("Account Holder: " + account214.getAccountHolder());
        System.out.println("Initial Balance: " + account214.getBalance());
        System.out.println("Account Type: " + account214.getAccountType());

        account214.deposit(500.0);
        System.out.println("Balance after deposit: " + account214.getBalance());

        account214.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account214.getBalance());

        account214.freezeAccount();
        account214.withdraw(100.0); // This should not change the balance
        System.out.println("Balance after attempting withdrawal from frozen account: " + account214.getBalance());

        account214.unfreezeAccount();
        account214.withdraw(100.0);
        System.out.println("Balance after withdrawal from unfrozen account: " + account214.getBalance());


        SavingsAccount mySavings = new SavingsAccount("Emlyn", 1000.0, 0.05);

        // Correct usage: accessing public methods
        System.out.println("Account Holder: " + mySavings.getAccountHolder());
        System.out.println("Initial Balance: " + mySavings.getBalance());

        mySavings.deposit(500.0);
        mySavings.withdraw(200.0);
        mySavings.applyInterest();
        mySavings.printAccountType();

        // ERROR: Cannot access private field 'balance' directly
        System.out.println(mySavings.balance); // Compile-time error

        //ERROR: Cannot access private field 'accountHolder' directly
        // System.out.println(mySavings.accountHolder); // Compile-time error
    }
    
}
