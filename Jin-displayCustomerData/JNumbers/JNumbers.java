package JNumbers;

public class JNumbers {
    /**
     * Sum up the numbers from 1 to number.
     * @param number
     * @return the final sum.
     */
    public static int sumNumbers(int number) {
        int sum = 0;
        // Sum up the numbers from 1 to number.
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Sum up the numbers from start to number.
     * Turns out that you can have the same name but when you have a
     * different number of parameters, it's a different function.
     * @param number
     * @param start
     * @return the final sum.
     */
    public static int sumNumbers(int number, int start) {
        int sum = 0;
        // Sum up the numbers from 1 to number starting at start.
        for (int i = start; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Sum up the numbers from 1 to number but increment by incr.
     * Uses a different number of parameters, so again, it is a different function.
     * @param number
     * @param incr
     * @return the final sum.
     */
    public static int sumNumbers(int start, int number, int incr) {
        int sum = 0;
        // Sum up the numbers from start to the number incrementing by incr instead of 1.
        for (int i = start; i <= number; i += incr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Sum up the decimals from start to end but increment by incr.
     * Uses different types of parameters (doubles, not ints) so still a different function.
     * @param start
     * @param end
     * @param incr
     * @return the final sum (type is double.)
     */
    public static double sumNumbers(double start, double end, double incr) {
        double sum = 0.0;
        // Sum up the floating-point numbers from start to end incrementing by incr instead of 1.
        for (double i = start; i <= end; i += incr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Print out the results from all the functions.
     * @param args
     */
    public static void main(String[] args) {
        // Get the sum of the numbers from 1 to 10 (including 10).
        System.out.println("Sum of numbers from 1 to 10: " + sumNumbers(10));
        // Get the sum of the numbers from 4 to 10 (including 10).
        System.out.println("Sum of numbers from 4 to 10: " + sumNumbers(10, 4));
        // Get the sum of the numbers from 1 to 10 (including 10) but incrementing by 2 instead of 1.
        System.out.println("Sum of numbers from 1 to 10 with increment of 2: " + sumNumbers(10, 2));
        // Get the sum of decimals from 0.5 to 2.5 but incrementing by 0.2.
        System.out.println("Sum of numbers from 0.5 to 2.5 with increment of 0.2: " + sumNumbers(0.5, 2.5, 0.2));
    }
}
