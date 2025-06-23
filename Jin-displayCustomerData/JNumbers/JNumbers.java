package JNumbers;

public class JNumbers {
    public static int sumNumbers(int number) {
        int sum = 0;
        // Sum up the numbers from 1 to number.
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumNumbersWithSpecificStart(int number, int start) {
        int sum = 0;
        // Sum up the numbers from 1 to number starting at start.
        for (int i = start; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumNumbersWithSpecificIncrement(int number, int incr) {
        int sum = 0;
        // Sum up the numbers from 1 to the number incrementing by incr instead of 1.
        for (int i = 1; i <= number; i += incr) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Get the sum of the numbers from 1 to 10 (including 10).
        System.out.println("Sum of numbers from 1 to 10: " + sumNumbers(10));
        // Get the sum of the numbers from 4 to 10 (including 10).
        System.out.println("Sum of numbers from 4 to 10: " + sumNumbersWithSpecificStart(10, 4));
        // Get the sum of the numbers from 1 to 10 (including 10) but incrementing by 2 instead of 1.
        System.out.println("Sum of numbers from 1 to 10: ");
    }
}
