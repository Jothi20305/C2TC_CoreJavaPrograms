package assignment6;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(101, 5000.0);

        // Attempt deposit
        try {
            account.deposit(2000); // valid
            account.deposit(-100); // invalid
        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } finally {
            account.displayBalance(); // always executed
        }

        System.out.println();

        // Attempt withdrawal
        try {
            account.withdraw(3000); // valid
            account.withdraw(5000); // invalid, exceeds balance
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance(); // always executed
        }
    }
}
