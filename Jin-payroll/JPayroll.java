
public class JPayroll {
    /**
     * Read the hourly wages of each employee.
     * @return "Done reading wages."
     */
    public static String readWages() {
        return "Done reading wages.";
    }

    /**
     * Calculate the gross pay.
     * @return "Done calculating gross pay."
     */
    public static String calculateGross() {
        return "Done calculating gross pay.";
    }

    /**
     * Calculate the taxes.
     * @return "Done calculating taxes and net pay."
     */
    public static String calculateTaxes() {
        return "Done calculating taxes and net pay.";
    }

    /**
     * Get the weekly hours of each employee.
     * @return "Done retireving weekly hours."
     */
    public static String getWeeklyHours() {
        return "Done retrieving weekly hours.";
    }

    /**
     * Print the total checks.
     * @return
     */
    public static String printChecks() {
        return "Done printing checks.";
    }
    /**
     * Call the other functions.
     * @param args
     */
    public static void main(String[] args) {
        // Call the functions.
        readWages();
        calculateGross();
        calculateTaxes();
        getWeeklyHours();
        printChecks();
        // Print the result.
        System.out.println("Called readWages, calculateGross, printChecks, and calculateTaxes.");
    }
}
