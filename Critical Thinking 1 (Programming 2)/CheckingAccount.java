public class CheckingAccount extends BankAccount {
	private double interestRate;

	public CheckingAccount() {
		super();
		this.interestRate = 0.0;
	}

	public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}

	public void processWithdrawl(double amount) {
		final double OVERDRAFT_FEE = 30.0;

		if (amount > getBalance()) {
			withdrawl(amount + OVERDRAFT_FEE);
			System.out.println("Notice: Overdraft occured! A $30.00 fee has been applied.");
			System.out.printf("New balance: $%.2f%n", getBalance());
		} else {
			withdrawl(amount);
			System.out.printf("Withdrawl of $%.2f successful. New balance: $%.2f%n", amount, getBalance());
		}
	}

	public void processWithdrawal(double amount) {
		processWithdrawl(amount);
	}

	public void displayAccount() {
		accountSummary();
		System.out.printf("Interest Rate: %.2f%%%n", interestRate);
	}
}