public class BankAccount {
	private String name;
	private int accntNumber;
	private double balance;

	private String transaction1, transaction2, transaction3;

	public BankAccount(String userName, int userAccount, double iniBalance) {
		name = userName;
		accntNumber = userAccount;
		balance = iniBalance;
	}

	public void depositAmount(double amount) {
		balance += amount;
		String trans = "deposit" + amount;
		updateTranscation(trans);
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance) {
			balance = balance - withdrawAmount;

			String trans = "withdraw" + withdrawAmount;
			updateTranscation(trans);
		} else
			System.out.println("You do not have sufficent funds. You have "
					+ balance + " in your account");
	}

	public void deposit(double depositAmount) {
		balance = balance += depositAmount;
		String trans = "deposit" + depositAmount;
		updateTranscation(trans);
	}

	public double checkBalance() {
		return balance;
	}

	public void updateTranscation(String newTransaction) {
		transaction3 = transaction2;
		transaction2 = transaction1;
		transaction1 = newTransaction;

	}

	public void dispayTransactions() {
		System.out.println(transaction1 + "" + transaction2 + "" + transaction3);
	}

	public void showData() {
		System.out.println("Name: " + name);
		System.out.println("Account number: " + accntNumber);
		System.out.println("Your balance: " + balance);
	}
}
