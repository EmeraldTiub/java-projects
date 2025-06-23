public class JPayroll {
    /**
     * Print out the checks.
     * @return a string.
     */
    public static String printChecks() {
        return "Done printing checks";
    }

    /**
     * Calculate the taxes and net pay.
     * @return a string.
     */
    public static String calculateTaxesNetPay() {
        return "Done calculating taxes and net pay";
    }

    /**
     * Calculate the gross pay.
     * @return a string.
     */
    public static String calculateGrossPay() {
        return "Done calculating gross pay.";
    }
    /**
     * Read the hourly wages.
     * @return a string.
     */
    public static String readHourlyWages() {
        return "Done reading hourly wages.";
    }

    /**
     * Get the weekly hours.
     * @return a string.
     */
    public static String getWeeklyHours() {
        return "Done getting weekly hours.";
    }

    /**
     * Call the other functions
     * @param args
     */
    public static void main(String[] args) {
        // Retrieve the weekly hours.
        getWeeklyHours();
        System.out.println("Retrieved weekly hours.");
        // Read the hourly wages.
        readHourlyWages();
        System.out.println("Read hourly wages.");
        // Calculate the gross pay.
        calculateGrossPay();
        System.out.println("Calculated gross pay.");
        // Calculate the taxes and net pay.
        calculateTaxesNetPay();
        System.out.println("Calculated taxes and net pay.");
        // Print out the checks.
        printChecks();
        System.out.println("Done printing checks.");
    }
}
