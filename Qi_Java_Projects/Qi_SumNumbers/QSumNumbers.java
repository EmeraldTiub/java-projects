package Qi_SumNumbers;

public class QSumNumbers {
    /*
     * Prints out what was returned from the variations of sum()
     *
     * @param Comand-line arguments. Not used here.
     */
    public static void main(String[] args) {
        System.out.println("The sum of numbers to 3 is " + sum(3));
        System.out.println("The sum of numbers from 2 to 5 is " + sum(2, 5));
        System.out.println("The sum of numbers from 3 to 11, increasing by 2 each time, is " + sum(3,11,2));
        System.out.println("The sum of numbers from 2.4 to 3.8, increasing by 0.2 each time, is " + sum(2.4, 3.8, 0.2));
    }

    /*
     * Sums up numbers from 1 to given number inclusive. If number was 10, it'll calculate 1+2+3+4+5+6+7+8+9+10
     *
     * @param No arguments
     * @return the sum of numbers from 1 to 10
     */
    public static int sum(int n) {
        // Define the variable: currSum (current sum)
        int currSum = 0; //

        // Repeat 10 times
        for (int i = 1; i <= n; i++) {
            // Add the current number to the sum
            currSum += i;
        }
        return currSum;
    }


    public static int sum(int start, int end) {
        // Define the variable: currSum
        int currSum = 0;

        // Set i = start so that in the first iteration, i starts at the desired value
        for (int i = start; i <= end; i++) {
            currSum += i;
        }
        return currSum;
    }

    public static int sum(int start, int end, int incrBy) {
        // Define the variable: currSum
        int currSum = 0;

        // Increment by incrBy
        for (int i = start; i <= end; i+=incrBy) {
            currSum += i;
        }
        return currSum;
    }

    public static double sum(double start, double end, double incrBy) {
        // Define the variable currSum as a double.
        double currSum = 0.0;

        // i should be a double too
        for (double i = start; i <= end; i+= incrBy) {
            currSum += i;
        }
        return currSum;
    }
}