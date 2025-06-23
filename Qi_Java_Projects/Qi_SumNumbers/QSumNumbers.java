package Qi_SumNumbers;

public class QSumNumbers {

    /*
     * Sums up numbers from 1 to 10 inclusive, like, 1+2+3+4+5+6+7+8+9+10
     *
     * @param No arguments
     * @return the sum of numbers from 1 to 10
     */
    public static int sum() {
        /*
         * Define the variable: currSum (current sum)
         *
         * What if we want to give a starting value as well?
         * Set this variable to another number to change starting value
         * Example: if you want to start at 5, set currSum to 5
         */
        int currSum = 0; //

        // Repeat 10 times
        for (int i = 1; i <= 10; i++) {
            /*
             * Add the current number to the sum
             *
             * What if we want to increment by a specific value instead of one?
             * Add n (your desired value to increment by) minus i.
             * Example: if you want to add 2 each time, add 1 to i, like currSum += i + 1;
             */
            currSum += i;
        }

        return currSum;
    }

    /*
     * Prints out what was returned from sum()
     *
     * @param Comand-line arguments. Not used here.
     */
    public static void main(String[] args) {
        System.out.println(sum());
    }
}
