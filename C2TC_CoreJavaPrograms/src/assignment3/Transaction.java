package assignment3;

public class Transaction {
	 public static final double transactionFee = 5.00;

	    public final void performTransaction(Account account, double amount, boolean isDeposit) {
	        if (isDeposit) {
	            account.deposit(amount);
	        } else {
	            account.withdraw(amount + transactionFee); // Fee applied to withdrawals
	        }

	        System.out.println("Transaction completed. Current Balance: $" + account.getBalance());
	        System.out.println("Transaction Fee Applied: $" + transactionFee);
	    }
}
