package assignment3;

public abstract class Account {
	protected String accountNumber;
    protected double balance;

    // Constructor
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

        // Ensure Bank class exists and has this method
        Bank.incrementAccountCount();
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + getBalance());  // Use getBalance() for consistency
    }
}
