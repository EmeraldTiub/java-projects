package Qi_DisplayCustomerData;

public class QDisplayCustomerData {

    /*
     * Prints out the customer's name, age (in days and years), and balance (in dollars)
     *
     * @return The customer details in the following format:
     * The customer's name is [name]. The customer is [# of days] days old or about [# of years] years old. The customer's balance is $[balance].
     */
    public static void main(String[] args) {
        // Set the variables (name, age in days, and balance)
        String name = "joe";
        int daysOld = 19436;
        float balance = 163.89f;

        // Print the results
        System.out.printf("The customer's name is %s. The customer is %d days old or about %d years old. The customer's balance is $%f.", name, daysOld, daysOld / 365, balance);
    }
}
