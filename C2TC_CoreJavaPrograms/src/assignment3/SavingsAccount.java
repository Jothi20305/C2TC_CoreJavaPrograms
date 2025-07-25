package assignment3;

public class SavingsAccount extends Account{
	 private double interestRate = 0.03; // 3%

	    public SavingsAccount(String accountNumber, double initialBalance) {
	        super(accountNumber, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited $" + amount + " to Savings Account");
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew $" + amount + " from Savings Account");
	        } else {
	            System.out.println("Insufficient balance in Savings Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance + (balance * interestRate);
	    }
}
