package Qi.Qi_TemperatureConversions;

import java.util.Scanner;

public class TemperatureConversions {
    /*
     * Prompts user for conversion and runs the corresponding function to do the conversion
     *
     * @return Results from the conversion function called
     */
    public static void main(String[] args) {
        // Display the menu to the user
        System.out.println("Temperature Conversions Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Fahrenheit to Kelvin");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Celsius to Kelvin");
        System.out.println("5. Kelvin to Fahrenheit");
        System.out.println("6. Kelvin to Celsius");
        System.out.println("0. EXIT");

        Scanner scan = new Scanner(System.in); // Set up the scanner to read console lines

        // Prompt the user for their choice
        System.out.println("Which conversion would you like to do (Enter a number from 1 to 6) or exit (0)? ");
        int response = 0;
        while (true) {
            if (scan.hasNextInt()) {
                int input = scan.nextInt();
                if (0 <= input && input <= 6) { // When their choice is valid, store that and break out of the while loop
                    response = input;
                    break;
                }
                else { // If the input is an int, but it isn't within 1 and 6, ask again
                    // Don't do scan.next() here because scan.nextInt() was already used before
                    System.out.println("Invalid input. Please enter a number from 1 to 6.");
                    System.out.println("Which conversion would you like to do (Enter a number from 1 to 6)? ");
                }
            } else { // If the user didn't put in a number, ask again
                scan.next();
                System.out.println("Invalid input. Please enter a number from 1 to 6.");
                System.out.println("Which conversion would you like to do (Enter a number from 1 to 6)? ");
            }
        }
        if (response == 0) {
            System.out.println("Exiting...");
            scan.close();
            return;
        }

        System.out.println("Enter a temperature (Kelvin temperatures must be non-negative): ");
        double temp = 0.0;
        while (true) {
            if (scan.hasNextDouble()) {
                temp = scan.nextDouble();
                break;
            } else {
                scan.next();
                System.out.println("Invalid input. Please enter a number, whole or decimal.");
                System.out.println("Enter a temperature (Kelvin temperatures must be non-negative): ");
            }
        }
        // Run the corresponding conversion function depending on the number chosen
        if (response == 1) {
            System.out.println("The temperature in Celsius is " + FtoC(temp));
        } else if (response == 2) {
            System.out.println("The temperature in Kelvin is " + FtoK(temp));
        } else if (response == 3) {
            System.out.println("The temperature in Fahrenheit is " + CtoF(temp));
        } else if (response == 4) {
            System.out.println("The temperature in Kelvin is " + CtoK(temp));
        } else if (response == 5) {
            System.out.println("The temperature in Fahrenheit is " + KtoF(temp));
        } else {
            System.out.println("The temperature in Celsius is " + KtoC(temp));
        }
        scan.close(); // close the scanner, not needed anymore
    }

    /*
     * Convert from Fahrenheit to Celsius
     *
     * @return The given Fahrenheit temperature in Celsius
     */
    public static double FtoC(double fahrenheit) {
        return (fahrenheit - 32) / 1.8; // Convert from Fahrenheit to Celsius
    }

    /*
     * Convert from Fahrenheit to Kelvin
     *
     * @return The given Fahrenheit temperature in Kelvin
     */
    public static double FtoK(double fahrenheit) {
        return ((fahrenheit - 32) / 1.8) + 273.15; // Convert
    }

    /*
     * Convert from Celsius to Fahrenheit
     *
     * @return The given Celsius temperature in Fahrenheit
     */
    public static double CtoF(double celsius) {
        return (celsius * 1.8) + 32; //
    }

    /*
     * Convert from Celsius to Kelvin
     *
     * @return The given Celsius temperature in Kelvin
     */
    public static double CtoK(double celsius) {
        return (celsius + 273.15); // Convert from Celsius to Kelvin
    }

    /*
     * Convert from Kelvin to Fahrenheit
     *
     * @return The given Kelvin temperature in Fahrenheit
     */
    public static double KtoF(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Kelvin degrees cannot be negative. Exiting...");
        }
        return ((kelvin - 273.15) * 1.8) + 32; // Convert from Fahrenheit to Celsius
    }

    /*
     * Convert from Kelvin to Celsius
     *
     * @return The given Kelvin temperature in Celsius
     */
    public static double KtoC(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Kelvin degrees cannot be negative. Exiting...");
        }
        return (kelvin - 273.15);
    }
}
