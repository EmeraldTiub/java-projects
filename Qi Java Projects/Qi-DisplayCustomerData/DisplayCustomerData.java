public class DisplayCustomerData {

    /*
     * State the name, age (in days and years, rounded to a whole number), and balance of a customer
     *
     * @return The details of the customer in the following format:
     * The customer's name is [name]. The customer is [# of days] days old ([# of years] years old). The customer's balance is [balance].
     */
    public static void main(String[] args) {
        String name = "Fred Jones"; // set name to the name of the customer provided (Fred Jones)
        int daysOld = 19436; // set daysOld to the customer's age in # of days
        float balance = 567.89f; // set balance to the customer's balance

        // print the results
        System.out.printf("The customer's name is %s. The customer is %s days old (%s years old). The customer's balance is $%s.%n"
                            , name, daysOld, daysOld / 365, balance);
    }
}
