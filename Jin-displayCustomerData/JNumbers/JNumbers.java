package JNumbers;

public class JNumbers {
    /**
     * Sum up the numbers from 1 to a given number.
     * @param number The number which you want to get the sum from 1 to it.
     * @return the sum of the numbers.
     */
    public static int sumNumbers(int number) {
        int sum = 0;
        // Sum up the numbers from 1 to number.
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumNumberWithSpecificStart(int number, int start) {
        int sum = 0;
        // Start summing up the numbers, with a specified starting point.
        for (int i = start; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    /**
     * Sums up the numbers from 1 to a given number but instead of incrementing the addition by one,
     * it increments the addition by incr.
     * @param number The number which you want to get the sum from 1 to it but skipping over values.
     * @param incr The specified increment that replaces the increment of 1.
     * @return The total sum of all the numbers but skipping some.
     */
    public static int sumSpecificNumbers(int number, int incr) {
        int sum = 0;
        // Sum up the numbers from 1 to the numbers, incrementing by incr instead of 1.
        for (int i = 1; i <= number; i += incr) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Finding the sum of the numbers from 1 to 10.
        System.out.println(sumNumbers(10));
        // Finding the sum of the numbers from 1 to 10, but skips over a specified value.
        System.out.println(sumSpecificNumbers(10, 5));
    }
}
