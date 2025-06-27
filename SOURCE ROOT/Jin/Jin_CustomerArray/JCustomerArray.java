package Jin.Jin_CustomerArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JCustomerArray {
    /**
     * Read in the customer data from CustomerData.csv
     * @param file
     * @return an array of Customer objects
     * @throws FileNotFoundException
     */
    public static JCustomer[] readData(File file) throws FileNotFoundException {
        // Use the first line to create the result array.
        Scanner scanner = new Scanner(file);
        int customerCount = Integer.parseInt(scanner.nextLine());

        // Skip the line that says the format of the file
        scanner.nextLine();

        // Create the result array (initially empty)
        JCustomer[] customers = new JCustomer[customerCount];
        for (int i = 0; i < customerCount; i++) {
            // Extract the data from each line.
            String[] data = scanner.nextLine().split(",");

            // Make the Customer object and add it to the result array.
            JCustomer customer = new JCustomer(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
            customers[i] = customer;
        }
        scanner.close();
        return customers;
    }

    /**
     * Print out the info of each customer in CustomerData.csv
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\jiny2\\IdeaProjects\\java-projects\\SOURCE ROOT\\Jin\\Jin_CustomerArray\\CustomerData.csv");
        JCustomer[] customers = null;
        try {
            customers = readData(file);
        } catch (FileNotFoundException e) {
            // Handle the case where the CSV file is not found.
            System.err.println("CustomerData.csv was not found.");
            System.err.println("Please make sure it is in the same directory as this script.");
            return;
        }

        // Print out each customer's info
        for (int i = 0; i < customers.length; i++) {
            System.out.printf("Full Name: %s %s\n", customers[i].getFirstName(), customers[i].getLastName());
            System.out.println("Age: " + customers[i].getAge());
            System.out.println("Balance: $" + customers[i].getBalance());
            System.out.println("-------------------------");
        }
    }
}
