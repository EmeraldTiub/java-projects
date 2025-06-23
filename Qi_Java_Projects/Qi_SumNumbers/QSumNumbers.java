package Qi_SumNumbers;

public class QSumNumbers {

    /*
     * Sums up numbers from 1 to 10 inclusive, like, 1+2+3+4+5+6+7+8+9+10
     *
     * @param No arguments
     * @return the sum of numbers from 1 to 10
     */
    public static int sum() {
        // define the variables: currSum (current sum) and currNum (current number to be added to sum)
        int currSum = 0; // Set this variable to another number to change starting value
        int currNum = 1;

        // repeat 10 times
        for (int i = 1; i <= 10; i++) {
            // add the current number to the sum
            currSum += currNum;

            // shift the current number up
            currNum++; // Change how much is added to currNum if you want it to increment by another value
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
