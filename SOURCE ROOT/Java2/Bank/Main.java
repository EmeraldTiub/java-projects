package Java2.Bank;

public class Main {
    /**
     * Creates a Bank object, adds BankAccount objects to it, and displays the bank
     * details and account.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Create a bank.
        Bank bank = new Bank("Test Bank", 0.05);

        // Add some accounts to the bank.
        bank.addAccount(new BankAccount("Alice", "123456789", 10.0));
        bank.addAccount(new BankAccount("Bob", "987654321", 100.0));
        bank.addAccount(new BankAccount("Charlie", "246813579", 1000.0));
        bank.addAccount(new BankAccount("David", "369852741", 10000.0));
        bank.addAccount(new BankAccount("Eve", "481973562", 100000.0));
        bank.addAccount(new BankAccount("Frank", "593194783", 1000000.0));

        // Display the bank info.
        System.out.println(bank);
        System.out.println(bank.displayAccounts());
        System.out.println(bank.getBalanceTotal());
        System.out.println(bank.getInterestRate());
    }
}
