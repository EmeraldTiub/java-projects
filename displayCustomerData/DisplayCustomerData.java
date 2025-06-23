public class DisplayCustomerData {
    public static void main(String[] args) {
        String name = "Fred Jones";
        int daysOld = 19436;
        double balance = 567.89;
        int yearsOld = (int) daysOld / 365;
        System.out.println("Name: " + name);
        System.out.println("Age (in years): " + yearsOld);
        System.out.println("Balance: " + balance);
    }
}
