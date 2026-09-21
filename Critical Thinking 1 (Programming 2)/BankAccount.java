public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;

	public BankAccount() {
		this.balance = 0.0;
		this.firstName = "";
		this.lastName = "";
		this.accountID = 0;
	}

	public BankAccount(String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0.0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}

	public void withdrawl(double amount) {
		this.balance -= amount;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void accountSummary() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.printf("Balance: $%.2f%n", balance);
	}
}