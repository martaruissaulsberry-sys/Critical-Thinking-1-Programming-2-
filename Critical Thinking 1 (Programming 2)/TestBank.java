public class TestBank {
    public static void main(String[] args) {
        CheckingAccount myChecking = new CheckingAccount("Martaruis", "Saulsberry", 100458, 1.75);

        System.out.println("=== Initial Account Details ===");
        myChecking.displayAccount();

        System.out.println("\nDepositing $150.00...");
        myChecking.deposit(150.00);
        myChecking.displayAccount();

        System.out.println("\nWithdrawing $150.00");
        myChecking.processWithdrawal(150.00);

        System.out.println("\nAttempting to withdraw $200.00 (triggers overdraft)...");
        myChecking.processWithdrawal(150.00);

        System.out.println("\n=== Final Account Details ===");
        myChecking.displayAccount();
    }
}