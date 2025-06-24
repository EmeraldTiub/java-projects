package Qi_Payroll;

public class QPayroll {
    /*
     * Calls each separate function that's on the row below it in the hierarchy
     *
     * @return Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        inputWeeklyHours();
        readHourlyWages();
        calculateGrossPay();
        calculateTaxesAndNetPay();
        printChecks();
    }

    /*
     * Verifies that it was called from main()
     *
     * @return inputWeeklyHours() was called from the main function
     */
    public static void inputWeeklyHours() {
        System.out.println("inputWeeklyHours() was called from the main function");
    }

    /*
     * Verifies that it was called from main()
     *
     * @return readHourlyWages() was called from the main function
     */
    public static void readHourlyWages() {
        System.out.println("readHourlyWages() was called from the main function");
    }

    /*
     * Verifies that it was called from main()
     *
     * @return calculateGrossPay() was called from the main function
     */
    public static void calculateGrossPay() {
        System.out.println("calculateGrossPay() was called from the main function");
    }

    /*
     * Verifies that it was called from main()
     *
     * @return calculateTaxesAndNetPay() was called from the main function
     */
    public static void calculateTaxesAndNetPay() {
        System.out.println("calculateTaxesAndNetPay() was called from the main function");
    }

    /*
     * Verifies that it was called from main()
     *
     * @return printChecks() was called from the main function
     */
    public static void printChecks() {
        System.out.println("printChecks() was called from the main function");
    }
}