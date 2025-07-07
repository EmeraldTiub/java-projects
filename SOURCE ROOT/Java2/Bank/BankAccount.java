package Java2.Bank;

public class BankAccount {
    // Create the account information.
    private double balance;
    private String ownerName;
    private String id;
    private String status = "closed";

    /**
     * Constructor for the BankAccount class with the owner name, account ID, and initial balance.
     *
     * @param ownerName the name of the account owner
     * @param id the ID for the bank account
     * @param balance the initial balance of the account, which must be a non-negative value
     * @throws IllegalArgumentException if the initial balance is negative
     */
    public BankAccount(String ownerName, String id, double balance) throws IllegalArgumentException {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be a non-negative decimal.");
        }
        this.ownerName = ownerName;
        this.id = id;
        this.balance = balance;
    }

    // Accessor methods.

    /**
     * Retrieves the current balance of the account.
     *
     * @return the current balance as a double
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieves the name of the account owner.
     *
     * @return the owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Retrieves the ID of the bank account.
     *
     * @return the account ID
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the current status of the bank account.
     *
     * @return the account status
     */
    public String getStatus() {
        return status;
    }

    // Mutator methods

    /**
     * Changes the balance of the bank account to the specified value.
     *
     * @param newBalance the new balance to set, which must be a non-negative double value
     * @throws IllegalArgumentException if the specified new balance is negative
     */
    public void setBalance(double newBalance) throws IllegalArgumentException {
        if (newBalance < 0) {
            throw new IllegalArgumentException("Balance must be a non-negative decimal.");
        }
        this.balance = newBalance;
    }

    /**
     * Changes the name of the account owner.
     *
     * @param newOwnerName the new name of the account owner
     */
    public void setOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    /**
     * Updates the status of the bank account to the specified value.
     * The status must be either "open" or "closed".
     *
     * @param newStatus the new status for the account. Must be "open" or "closed"
     * @throws IllegalArgumentException if the provided status is not "open" or "closed"
     */
    public void setStatus(String newStatus) throws IllegalArgumentException {
        if (!newStatus.equals("open") && !newStatus.equals("closed")) {
            throw new IllegalArgumentException("Status must be either \"open\" or \"closed\".");
        }
        this.status = newStatus;
    }

    /**
     * Deposits a non-negative amount into the bank account.
     *
     * @param amount the amount of money to deposit
     * @throws IllegalArgumentException if the deposit amount is negative
     */
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid deposit amount.");
        }
        balance += amount;
    }

    /**
     * Withdraws a specified amount from the account balance.
     *
     * @param amount the amount of money to withdraw
     * @throws IllegalArgumentException if the withdrawal amount exceeds the current balance
     */
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        } else {
            balance -= amount;
        }
    }

    public String toString() {
        // Make the top of the table.
        String res = "+—————————————+———————————————————————+\n";

        // Format the owner name.
        String spaces = "";
        int spacesNeeded = 22 - ownerName.length();
        for (int i = 0; i < spacesNeeded; i++) spaces += " ";
        res += "| Owner Name  | " + ownerName + spaces + "|\n";

        // Format the account ID.
        spacesNeeded = 22 - id.length();
        spaces = "";
        for (int i = 0; i < spacesNeeded; i++) spaces += " ";
        res += "| Account ID  | " + id + spaces + "|\n";

        // Format the account balance.
        spacesNeeded = 22 - Double.toString(balance).length();
        spaces = "";
        for (int i = 0; i < spacesNeeded - 1; i++) spaces += " ";
        res += "| Balance     | $" + balance + spaces + "|\n";

        // Close the table.
        res += "+—————————————+———————————————————————+";
        // Return the result.
        return res;
    }
}
