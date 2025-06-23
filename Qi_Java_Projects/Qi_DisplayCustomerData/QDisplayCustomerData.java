package Qi_DisplayCustomerData;

public class QDisplayCustomerData {

    /*
     * State the name, age (in days and years, rounded to a whole number), and balance of a customer
     *
     * @return The details of the customer in the following format:
     * The customer's name is [name]. The customer is [# of days] days old ([# of years] years old). The customer's balance is [balance].
     */
    public static void main(String[] args) {
        String name = "Fred Jones"; // set name to the name of the customer provided (Fred Jones)
        
        /*
         * set daysOld to the customer's age in # of days
         * another way, using years for the age instead of days, is: int age = (int) (19436 / 365);
         */
        int daysOld = 19436;
        
        float balance = 567.89f; // set balance to the customer's balance

        // print the results
        System.out.printf("The customer's name is %s. The customer is %s days old (%s years old). The customer's balance is $%s.%n"
                            , name, daysOld, daysOld / 365, balance);
    }
}
