public class DisplayCustomerData {
    public static void main(String[] args) {
        // Make the example customer data.
        String name = "Fred Jones";
        int daysOld = 19436;
        double balance = 567.89;
        // Convert the age in days to years.
        int yearsOld = (int) daysOld / 365;
        // Print out the results.
        System.out.println("Name: " + name);
        System.out.println("Age (in years): " + yearsOld);
        System.out.println("Balance: " + balance);
    }
}
