package Qi.Qi_CustomerArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QCustomerArray {
    /*
     * Read data from CustomerData.csv and put it in an array of Customer objects
     *
     * @return  customers   An array of Customer objects
     * @throw               FileNotFoundException
     */
    public static Customer[] readData() throws FileNotFoundException {
        // Set up the scanner to read data from CustomerData.csv
        File customerData = new File("C:\\Users\\qiy20\\IdeaProjects\\java-projects\\SOURCE ROOT\\Qi\\Qi_CustomerArray\\CustomerData.csv");
        Scanner scan = new Scanner(customerData);

        int customerCount = Integer.parseInt(scan.nextLine()); // Get the count of customers by reading the first line in the file

        scan.nextLine(); // Skip past the line saying "first name, last name, age, balance"

        Customer[] customers = new Customer[customerCount]; // Set up an array using customerCount to have space for all customers

        // Loop customerCount times to get through all the customers
        for (int i = 0; i < customerCount; i++) {
            // Get each detail of the customer (first name, last name, age, balance)
            String[] details = scan.nextLine().split(",");
            String firstName = details[0];
            String lastName = details[1];
            int age = Integer.parseInt(details[2]);
            double balance = Double.parseDouble(details[3]);

            // Make a Customer object from the details and add it to the customers array
            Customer cust = new Customer(firstName, lastName, age, balance);
            customers[i] = cust;
        }
        return customers;
    }

    /*
     * Displays each customer in string format, using the toString() method in the Customer class
     *
     * @param Command-line arguments, not used here.
     * @return Nothing
     */
    public static void main(String[] args) {
        // Make the customers variable here so it can be accessed throughout the function
        Customer[] customers;

        // Handle a possible FileNotFoundException
        try {
            customers = readData();
        } catch (FileNotFoundException e) {
            System.out.println("CustomerData.csv file not found.");
            System.out.println("Please make sure it exists and is in the same directory.");
            return;
        }

        // Loop through the customers array and display customer details
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i] + "\n"); // toString() calls automatically
        }
    }
}