package assignment3;

public class MainDemo {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("S001", 1000);
        CheckingAccount ca = new CheckingAccount("C001", 2000);

        Transaction transaction = new Transaction();

        transaction.performTransaction(sa, 500, true);  
        transaction.performTransaction(ca, 300, false); 

        sa.displayAccountDetails();
        ca.displayAccountDetails();

        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());

	}

}
