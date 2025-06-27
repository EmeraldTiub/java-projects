package Qi.Qi_CustomerArray;

public class Customer {
    // Set up the variables for customer details
    private String firstName;
    private String lastName;
    private int age;
    private double balance;

    /*
     * Set up the Customer object
     *
     * @param   firstName   The first name of the customer
     *          lastName    The last name of the customer
     *          age         The age of the customer
     *          balance     The customer's balance
     */
    public Customer(String firstName, String lastName, int age, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
    }

    /*
     * Get the first name of the customer
     *
     * @return The customer's first name
     */
    public  String getFirstName() {
        return this.firstName;
    }

    /*
     * Get the last name of the customer
     *
     * @return The customer's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /*
     * Get the age of the customer
     *
     * @return The customer's age
     */
    public int getAge() {
        return this.age;
    }

    /*
     * Get the balance of the customer
     *
     * @return The customer's balance
     */
    public  double getBalance() {
        return this.balance;
    }

    /*
     * Set the first name of the customer to a given first name
     *
     * @return The new first name
     */
    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    /*
     * Set the last name of the customer to a given last name
     *
     * @return The new last name
     */
    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    /*
     * Set the age of the customer to a given age
     *
     * @return The new age
     */
    public int setAge(int age) {
        this.age = age;
        return age;
    }

    /*
     * Set the balance of the customer to a given balance
     *
     * @return The new balance
     */
    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    /*
     * Provide a string representation of the Customer object
     *
     * @return The Customer object in string format, including the first name, last name, age, and balance
     */
    @Override
    public String toString() {
        return "First Name: " + this.firstName + "\n"
                + "Last Name: " + this.lastName + "\n"
                + "Age: " + this.age + "\n"
                +  "Balance: " + this.balance;
    }
}