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

        // Prof. Barry did it this way, dividing by 365 right when the variable is made.
        int age = 19436 / 365;
        float balance = 163.89f;

        // Print the results
        /* Edit: changed %f to %s when showing balance.
         * originally, it showed 163.889999 because floats like to be 6 decimal places
         * (that's the max # of decimal places a float can have)
         * when its %s, it automatically calls the Float.toString()
         */
        System.out.printf("The customer's name is %s. The customer is %d years old. The customer's balance is $%s.%n", name, age, balance);
    }
}