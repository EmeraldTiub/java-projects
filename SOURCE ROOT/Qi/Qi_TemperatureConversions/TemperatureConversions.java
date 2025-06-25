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
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Fahrenheit to Kelvin");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Celsius to Kelvin");
        System.out.println("5. Kelvin to Fahrenheit");
        System.out.println("6. Kelvin to Celsius");

        Scanner scan = new Scanner(System.in); // Set up the scanner to read console lines

        // Prompt the user for their choice
        System.out.println("Which conversion would you like to do (Enter a number from 1 to 6)? ");
        int response = 0;
        while (true) {
            if (scan.hasNextInt()) {
                int input = scan.nextInt();
                if (1 <= input && input <= 6) { // When their choice is valid, store that and break out of the while loop
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

        // Run the corresponding conversion function depending on the number chosen
        if (response == 1) {
            FtoC();
        } else if (response == 2) {
            FtoK();
        } else if (response == 3) {
            CtoF();
        } else if (response == 4) {
            CtoK();
        } else if (response == 5) {
            KtoF();
        } else {
            KtoC();
        }
        scan.close(); // close the scanner, not needed anymore
    }

    /*
     * Convert from Fahrenheit to Celsius
     *
     * @return The given Fahrenheit temperature in Celsius
     */
    public static void FtoC() {
        Scanner scan = new Scanner(System.in); // set up scanner again (this is why scan.close() is after all the function-calling)
        System.out.println("Enter the temperature in Fahrenheit: "); // Prompt the user to put in a Fahrenheit temperature
        double fahrenheit = 0; // Set the variable as a double because temperature can be decimals
        while (true) {
            if (scan.hasNextDouble()) { // If the user put in a whole number or decimal, store that and break out of the while loop
                fahrenheit = scan.nextDouble();
                break;
            } else { // For any other reason, ask again
                scan.next();
                System.out.println("Invalid input. Please enter a number (whole or decimal).");
                System.out.println("Enter the temperature in Fahrenheit: ");
            }
        }
        System.out.println("The temperature in Celsius is " + (fahrenheit - 32) / 1.8); // Convert from Fahrenheit to Celsius
    }

    /*
     * Convert from Fahrenheit to Kelvin
     *
     * @return The given Fahrenheit temperature in Kelvin
     */
    public static void FtoK() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = 0;
        while (true) {
            if (scan.hasNextDouble()) {
                fahrenheit = scan.nextDouble();
                break;
            } else {
                scan.next();
                System.out.println("Invalid input. Please enter a number (whole or decimal).");
                System.out.println("Enter the temperature in Fahrenheit: ");
            }
        }
        System.out.println("The temperature in Kelvin is " + ((fahrenheit - 32) / 1.8) + 273.15); // Convert
    }

    /*
     * Convert from Celsius to Fahrenheit
     *
     * @return The given Celsius temperature to Fahrenheit
     */
    public static void CtoF() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = 0;
        while (true) {
            if (scan.hasNextDouble()) {
                celsius = scan.nextDouble();
                break;
            } else {
                scan.next();
                System.out.println("Invalid input. Please enter a number (whole or decimal).");
                System.out.println("Enter the temperature in Celsius: ");
            }
        }
        System.out.println("The temperature in Fahrenheit is " + ((celsius * 1.8) + 32)); //
    }

    /*
     * Convert from Celsius to Kelvin
     *
     * @return The given Celsius temperature to Kelvin
     */
    public static void CtoK() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = 0;
        while (true) {
            if (scan.hasNextDouble()) {
                celsius = scan.nextDouble();
                break;
            } else {
                scan.next();
                System.out.println("Invalid input. Please enter a number (whole or decimal).");
                System.out.println("Enter the temperature in Celsius: ");
            }
        }
        System.out.println("The temperature in Kelvin is " + (celsius + 273.15)); // Convert from Celsius to Kelvin
    }

    /*
     * Convert from Kelvin to Fahrenheit
     *
     * @return The given Kelvin temperature to Fahrenheit
     */
    public static void KtoF() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Kelvin: ");
        double kelvin = 0;
        while (true) {
            if (scan.hasNextDouble()) {
                kelvin = scan.nextDouble();
                if (kelvin >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number (whole or decimal).");
                    System.out.println("Enter the temperature in Kelvin: ");
                }
            } else {
                scan.next();
                System.out.println("Invalid input. Please enter a non-negative number (whole or decimal).");
                System.out.println("Enter the temperature in Kelvin: ");
            }
        }
        System.out.println("The temperature in Fahrenheit is " + ((kelvin - 273.15) * 1.8) + 32); // Convert from Fahrenheit to Celsius
    }

    /*
     * Convert from Kelvin to Celsius
     *
     * @return The given Kelvin temperature to Celsius
     */
    public static void KtoC() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Kelvin: ");
        double kelvin = 0;
        while (true) {
            if (scan.hasNextDouble()) {
                kelvin = scan.nextDouble();
                if (kelvin >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number (whole or decimal).");
                    System.out.println("Enter the temperature in Kelvin: ");
                }
            } else {
                scan.next();
                System.out.println("Invalid input. Please enter a non-negative number (whole or decimal).");
                System.out.println("Enter the temperature in Kelvin: ");
            }
        }
        System.out.println("The temperature in Fahrenheit is " + (kelvin - 273.15));
    }
}
