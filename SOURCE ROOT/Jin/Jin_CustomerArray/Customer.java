package Jin.Jin_CustomerArray;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private double balance;
    // Constructor for the Customer class.
    public Customer(String firstName, String lastName, int age, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
    }

    // Accessor methods

    /**
     * Retrieves the first name of the customer.
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the customer
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the age of the customer
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the balance of the customer
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    // Mutator methods

    /**
     * Changes the first name of the customer
     * @param newFirstName
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    /**
     * Changes the last name of the customer
     * @param newLastName
     */
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    /**
     * Changes the age of the customer
     * @param newAge
     */
    public void setAge(int newAge) {
        age = newAge;
    }

    /**
     * Changes the balance of the customer
     * @param newBalance
     */
    public void setBalance(int newBalance) {
        balance = newBalance;
    }
}
