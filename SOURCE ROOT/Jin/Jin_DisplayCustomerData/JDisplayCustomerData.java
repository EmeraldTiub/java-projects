package Jin.Jin_DisplayCustomerData;

public class JDisplayCustomerData {
    public static void main(String[] args) {
        // Set the customer data.
        String name = "Fred Jones";
        /*
         the (int) is only making 19436 an int,
         so I have to put parentheses around the
         equation part.
         */
        int age = (int) (19436 / 365);
        double balance = 567.89;
        // Display the customer data.
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
    }
}