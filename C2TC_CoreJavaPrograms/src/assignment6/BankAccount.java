package assignment6;

public class BankAccount {
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber , double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount)throws InvalidAmountException{
		if(amount<=0) {
			throw new InvalidAmountException("Deposit amount must be greater than 0");
		}
		balance+=amount;
		System.out.println("Successfullt deposited ₹"+amount);
	}
	
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Successfully withdrew ₹" + amount);
    }

   
    public void displayBalance() {
        System.out.println("Account No: " + accountNumber + " | Current Balance: ₹" + balance);
    }
}
