import java.util.Scanner;

public class userOutputNeeded {

    /*
     * Prompts the user to enter the name, age (in days), and balance (in dollars) of a customer
     *
     * @return The details in the following format:
     * The customer's name is [name]. The customer is [# of days] days old ([# of years] years old). The customer's balance is [balance].
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner to read from the console

        System.out.print("Name of customer: "); // prompt the user to enter the customer's name
        String name = scanner.nextLine(); // read what name the user entered into the prompt

        System.out.print("Age of customer (in days): "); // prompt the user to enter the customer's age in days
        String daysOld = scanner.nextLine(); // read what number the user entered into the prompt

        System.out.print("Customer's balance (in dollars): "); // prompt the user to enter the customer's balance
        String balance = scanner.nextLine(); // read what amount the user entered into the prompt

        scanner.close(); // close the scanner

        // Print the results
        System.out.printf("The customer's name is %s. The customer is %s days old (%s years old). The customer's balance is $%s.%n"
                            , name, daysOld, Integer.parseInt(daysOld) / 365, balance);
    }
}
