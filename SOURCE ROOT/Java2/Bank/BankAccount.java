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
     * @return the new balance.
     * @throws IllegalArgumentException if the deposit amount is negative
     */
    public double deposit(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid deposit amount.");
        }
        balance += amount;
        return balance;
    }

    /**
     * Withdraws a specified amount from the account balance.
     *
     * @param amount the amount of money to withdraw
     * @return the new balance.
     * @throws IllegalArgumentException if the withdrawal amount exceeds the current balance
     */
    public double withdraw(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
        balance -= amount;
        return balance;
    }

    /**
     * Converts the account data into a string representation of
     * the bank account, including the account ID, owner's name,
     * balance, and status.
     *
     * @return a string of the bank account details
     */
    public String toString() {
        String res = "Account ID: %s\nOwner Name: %s\nBalance: $%.2f\nStatus: %s";
        return String.format(res, id, ownerName, balance, status);
    }
}
