package Qi_Payroll;
public class QPayroll {

    /*
     * Calls each separate function
     *
     * @return The results from each function called
     */
    public static void main(String[] args) {
        // Call each function on the layer below it in the hierarchy
        inputWeeklyHours();
        readHourlyWages();
        calculateGrossPay();
        calculateTaxesAndNetPay();
        printChecks();
    }

    /*
     * States that the function was called from the main function
     *
     * @return A string saying that inputWeeklyHours() was called from the main function
     */
    public static void inputWeeklyHours(){
        System.out.println("inputWeeklyHours() was called from the main function");
    }

    /*
     * States that the function was called from the main function
     *
     * @return A string saying that readHourlyWages() was called from the main function
     */
    public static void readHourlyWages(){
        System.out.println("readHourlyWages() was called from the main function");
    }

    /*
     * States that the function was called from the main function
     *
     * @return A string saying that calculateGrossPay() was called from the main function
     */
    public static void calculateGrossPay(){
        System.out.println("calculateGrossPay() was called from the main function");
    }

    /*
     * States that the function was called from the main function
     *
     * @return A string saying that calculateTaxesAndNetPay() was called from the main function
     */
    public static void calculateTaxesAndNetPay(){
        System.out.println("calculateTaxesAndNetPay() was called from the main function");
    }

    /*
     * States that the function was called from the main function
     *
     * @return A string saying that printChecks() was called from the main function
     */
    public static void printChecks(){
        System.out.println("printChecks() was called from the main function");
    }
}