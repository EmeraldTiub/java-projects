package Java2.Bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private String bankName;
    private double interestRate;

    public Bank(String bankName, double interestRate) {
        this.bankName = bankName;
        this.interestRate = interestRate;
    }

    // Accessor methods.

    /**
     * Retrieves a bank account based on the ID. If no
     * account with a matching ID is found, print out
     * a message.
     *
     * @param id the ID of the account to retrieve
     * @return the BankAccount with that ID. If none exist,
     *         tell the user that no account with that ID exists.
     */
    public BankAccount getAccount(String id) {
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount account = accounts.get(i);
            if (account.getId().equals(id)) {
                return account;
            }
        }
        System.out.println("ID not found. Please make sure you have the correct ID.");
        return null;
    }

    /**
     * Retrieves the list of all bank accounts associated with the bank.
     *
     * @return the ArrayList of BankAccount objects
     */
    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    /**
     * Retrieves the bank's interest rate.
     *
     * @return the interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Retrieves the name of the bank.
     *
     * @return the bank's name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Calculates the total balance of all bank accounts.
     *
     * @return the total balance of all accounts
     */
    public double getBalanceTotal() {
        double total = 0;
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount account = accounts.get(i);
            total += account.getBalance();
        }
        return total;
    }

    // Account methods.

    /**
     * Opens a bank account with the given ID. If there are multiple accounts
     * with the same ID, only the first one is opened, and a message is printed.
     * If no account is found with the provided ID, a different message is displayed.
     *
     * @param id the ID of the account to be opened
     */
    public void openAccount(String id) {
        boolean found = false;
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount account = accounts.get(i);
            if (account.getId().equals(id)) {
                if (found) {
                    System.out.println("Multiple accounts with that ID were found.");
                    System.out.println("Only the first account with that ID will open.");
                    return;
                }
                account.setStatus("open");
                return;
            }
        }
        System.out.println("A bank account with that ID does not exist.");
        System.out.println("Please make sure you have the correct ID.");
        return;
    }

    /**
     * Closes a bank account with the specified ID by updating its status to "closed".
     * If multiple accounts with the same ID are found, only the first account is closed,
     * and a message is printed. If no account with the specified ID exists,
     * a different message is displayed.
     *
     * @param id the ID of the account to close
     */
    public void closeAccount(String id) {
        boolean found = false;
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount account = accounts.get(i);
            if (account.getId().equals(id)) {
                if (found) {
                    System.out.println("Multiple accounts with that ID were found.");
                    System.out.println("Only the first account with that ID will close.");
                    return;
                }
                account.setStatus("closed");
                found = true;
            }
        }
        System.out.println("A bank account with that ID does not exist.");
        System.out.println("Please make sure you have the correct ID.");
        return;
    }

    /**
     * Adds a new bank account to the bank's list of accounts.
     *
     * @param newAccount the BankAccount to be added
     */
    public void addAccount(BankAccount newAccount) {
        accounts.add(newAccount);
    }

    // Set methods

    /**
     * Changes the name of the bank.
     *
     * @param newName the new name to assign to the bank
     */
    public void setBankName(String newName) {
        bankName = newName;
    }

    /**
     * Changes the interest rate for the bank.
     *
     * @param newRate the new interest rate
     */
    public void setInterestRate(double newRate) {
        interestRate = newRate;
    }


    public String displayAccounts() {
        String spaces;
        int spacesNeeded;

        // Create the start of the table of accounts.
        String accountTable = "+————————————————+————————————————+———————————————————————+\n";
        accountTable += "| Account ID     | Owner Name     | Balance               |\n";
        accountTable += "+————————————————+————————————————+———————————————————————+\n";

        for (int i = 0; i < accounts.size(); i++) {
            // Retrieve the account.
            BankAccount account = accounts.get(i);

            // Put the ID into the table.
            spacesNeeded = 14 - account.getId().length();
            spaces = "";
            for (int j = 0; j < spacesNeeded; j++) spaces += " ";
            accountTable += "| " + account.getId() + spaces + " | ";

            // Put the owner name into the table.
            spacesNeeded = 14 - account.getOwnerName().length();
            spaces = "";
            for (int j = 0; j < spacesNeeded; j++) spaces += " ";
            accountTable += account.getOwnerName() + spaces + " | ";

            // Put in the full balance into the table (so the balance doesn't get truncated to something like 1.23E)
            String fullBalance = String.format("%.2f", account.getBalance());
            spacesNeeded = 21 - fullBalance.length();
            spaces = "";
            for (int j = 0; j < spacesNeeded - 1; j++) spaces += " ";
            accountTable += "$" + fullBalance + spaces + " | ";

            accountTable += "\n";
        }

        // Bottom of the account table.
        accountTable += "+————————————————+————————————————+———————————————————————+";

        return accountTable;
    }


    /**
     * Returns a string representation of the bank object, including the bank's
     * details such as name, interest rate, and a formatted table of associated
     * bank accounts.
     *
     * @return a formatted string containing the bank's name, interest rate,
     *         and a table of all bank accounts
     */
    public String toString() {
        // Top of the table
        String bank = "+————————————————+————————————————————————————————+\n";

        // Add in a formatted row of the bank name to the table.
        String spaces = "";
        int spacesNeeded = 31 - bankName.length();
        for (int i = 0; i < spacesNeeded; i++) spaces += " ";
        bank += "| Bank Name      | " + bankName + spaces + "|\n";

        // Add in a formatted row of the interest rate to the table.
        spacesNeeded = 31 - Double.toString(interestRate).length();
        spaces = "";
        for (int i = 0; i < spacesNeeded - 1; i++) spaces += " ";
        bank += "| Interest Rate  | " + interestRate + "%" + spaces + "|\n";

        // Close the table.
        bank += "+————————————————+————————————————————————————————+\n";

        return bank;
    }
}
