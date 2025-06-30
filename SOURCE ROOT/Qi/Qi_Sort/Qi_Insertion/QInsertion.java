package Qi.Qi_Sort.Qi_Insertion;

public class QInsertion {
    /**
     * Sort a given array, nums, using insertion sort
     *
     * @param   nums   An unsorted array of numbers
     */
    public static void insertionSort(int[] nums) {
        // Start from the second item when sorting (explanation in "initial idea")
        for (int i = 1; i < nums.length; i++) {
            // Keep a variable of a copy of i. Can be changed without affecting the for loop
            int idx = i;

            // As long as the previous item is bigger than the current item...
            while (idx > 0 && nums[idx] < nums[idx-1]) {

                // Swap the two items
                int temp = nums[idx-1];
                nums[idx-1] = nums[idx];
                nums[idx] = temp;

                idx--; // Follow the original item
            }
        }
    }

    /**
     * Sort an array of numbers and print out the result
     *
     * @param   args   Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        // Make an unsorted array of numbers
        int[] nums = new int[]{1, 5, 2, 6, 8, 9, 3, 4};

        // Sort it using insertion sort
        insertionSort(nums);

        // Print out each item
        for (int i : nums) {
            System.out.println(i);
        }
    }
}