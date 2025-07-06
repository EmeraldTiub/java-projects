package Java2.Bank;

public class BankAccount {
    // Create the account information.
    private double balance;
    private String ownerName;
    private String id;
    private String status = "closed";

    /**
     * Constructs a new BankAccount instance with the
     * specified owner name, account id, and balance.
     *
     * @param ownerName the name of the account owner
     * @param id the ID of the account
     * @param balance the initial balance of the account
     */
    public BankAccount(String ownerName, String id, double balance) {
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
     * Changes the balance of the bank account.
     *
     * @param newBalance the new balance of the account
     */
    public void setBalance(double newBalance) {
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
     * Changes the status of the bank account.
     *
     * @param newStatus the new status to set for the account
     */
    public void setStatus(String newStatus) {
        this.status = newStatus;
    }

    /**
     * Deposits a non-negative amount into the bank account.
     *
     * @param amount the amount of money to deposit
     * @throws IllegalArgumentException if the deposit amount is negative
     */
    public void deposit(double amount) {
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
    public void withdraw(double amount) {
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
