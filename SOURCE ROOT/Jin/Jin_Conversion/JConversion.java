package Jin.Jin_Conversion;

import java.util.Scanner;

public class JConversion {
    /**
     * Convert some amount of degrees Fahrenheit to Celsius.
     * @param fahrenheit
     * @return the Celsius conversion.
     */
    public static double FtoC(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9);
    }
    /**
     * Convert some amount of degrees Fahrenheit to Kelvin.
     * @param fahrenheit
     * @return the Kelvin conversion.
     */
    public static double FtoK(double fahrenheit) {
        return ((fahrenheit - 32) * (5.0 / 9)) + 273.15;
    }
    /**
     * Convert some amount of degrees Celsius to Kelvin.
     * @param celsius
     * @return the Kelvin conversion.
     */
    public static double CtoK(double celsius) {
        return celsius + 273.15;
    }
    /**
     * Convert some amount of degrees Celsius to Fahrenheit.
     * @param celsius
     * @return the Fahrenheit conversion.
     */
    public static double CtoF(double celsius) {
        return (celsius * (9.0 / 5)) + 32;
    }
    /**
     * Convert some amount of degrees Kelvin to Fahrenheit.
     * @param kelvin
     * @return the Fahrenheit conversion.
     */
    public static double KtoF(double kelvin) {
        // Add a preconditions because Kelvin values have to be non-negative.
        if (kelvin < 0) {
            throw new IllegalArgumentException("Please enter a non-negative value for Kelvin degrees.");
        }
        return ((kelvin - 273.15) * (9.0 / 5)) + 32;
    }
    /**
     * Convert some amount of degrees Kelvin to Celsius.
     * @param kelvin
     * @return the Celsius conversion.
     */
    public static double KtoC(double kelvin) {
        // Add a precondition because Kelvin values have to be non-negative.
        if (kelvin < 0) {
            throw new IllegalArgumentException("Please enter a non-negative value for Kelvin degrees.");
        }
        return kelvin - 273.15;
    }
    /**
     * Ask the user to choose a conversion from 6 choices. If the user inputs an invalid choice, tell them
     * that it's invalid. Terminate if the user inputs an invalid data type for the conversion.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Show the choices for the user.
            System.out.println("Choose a conversion (or 0 to exit): ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Fahrenheit to Kelvin");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Celsius to Fahrenheit");
            System.out.println("5. Kelvin to Fahrenheit");
            System.out.println("6. Kelvin to Celsius");
            System.out.println("0. Exit");

            // Keep prompting the user if they input something invalid.
            Integer choice;
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice < 1 || choice > 6) {
                        System.out.println("Invalid choice. Please choose a number between 1 and 6.");
                    }
                    if (choice >= 1 && choice <= 6) {
                        break;
                    }
                }
                else {
                    System.out.println("Invalid user input. Please choose a number between 1 and 6");
                    scanner.nextLine();
                }
            }

            // If the user puts in an invalid data type or chooses the exit option,
            // terminate the script.
            try {
                if (choice == 0) {
                    return;
                }
                if (choice == 1) {
                    System.out.println("Choose how many degrees Fahrenheit to convert to Celsius: ");
                    String fahrenheit = scanner.nextLine();
                    double res = FtoC(Double.parseDouble(fahrenheit));
                    System.out.printf("Converted: %.2f\n", res);
                }
                if (choice == 2) {
                    System.out.println("Choose how many degrees Fahrenheit to convert to Kelvin: ");
                    String fahrenheit = scanner.nextLine();
                    double res = FtoK(Double.parseDouble(fahrenheit));
                    System.out.printf("Converted: %.2f\n", res);
                }
                if (choice == 3) {
                    System.out.println("Choose how many degrees Celsius to convert to Kelvin: ");
                    String celsius = scanner.nextLine();
                    double res = CtoK(Double.parseDouble(celsius));
                    System.out.printf("Converted: %.2f\n", res);
                }
                if (choice == 4) {
                    System.out.println("Choose how many degrees Celsius to convert to Fahrenheit: ");
                    String celsius = scanner.nextLine();
                    double res = CtoF(Double.parseDouble(celsius));
                    System.out.printf("Converted: %.2f\n", res);
                }
                if (choice == 5) {
                    System.out.println("Choose how many degrees Kelvin to convert to Fahrenheit");
                    Double kelvin = Double.parseDouble(scanner.nextLine());
                    while (kelvin < 0) {
                        System.out.println("Please enter a non-negative value.");
                        System.out.println("Choose how many degrees Kelvin to convert to Fahrenheit");
                        kelvin = Double.parseDouble(scanner.nextLine());
                    }
                    // Print out the converted version.
                    System.out.printf("Converted: %.2f\n", KtoF(kelvin));
                }
                if (choice == 6) {
                    System.out.println("Choose how many degrees Kelvin to convert to Celsius");
                    Double kelvin = Double.parseDouble(scanner.nextLine());
                    while (kelvin < 0) {
                        System.out.println("Please enter a non-negative value.");
                        System.out.println("Choose how many degrees Kelvin to convert to Celsius");
                        kelvin = Double.parseDouble(scanner.nextLine());
                    }
                    // Print out the converted version.
                    System.out.printf("Converted: %.2f\n", KtoC(kelvin));
                }
            } catch (NumberFormatException e) {
                System.out.println("Could not interpret that. Exiting...");
                return;
            }
        }
    }
}
