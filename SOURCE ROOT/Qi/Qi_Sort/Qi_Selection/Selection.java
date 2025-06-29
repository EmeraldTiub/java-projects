package Qi.Qi_Sort.Qi_Selection;

public class Selection {
    /**
     * Sort a given array, nums, using selection sort
     *
     * @param   nums   An unsorted array of numbers
     * @return  nums   The sorted version of nums
     */
    public static int[] selectionSort(int[] nums) {
        // Maximum # of passes: nums.length. i is also used for the moveTo variable
        for (int i = 0; i < nums.length; i++) {
            // Set up the variable that stores the index of the minimum element in the unsorted portion
            int minIdx = i;

            // Find the minimum element
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            // Only swap if the minimum element is not already in the correct position
            if (i != minIdx) {
                int temp = nums[minIdx];
                nums[minIdx] = nums[i];
                nums[i] = temp;
            }
        }

        // Return the sorted nums
        return nums;
    }

    /**
     * Runs selectionSort() on nums, an unsorted array, and prints out the items
     *
     * @param   args   Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        // Make an array of scrambled numbers
        int[] nums = new int[]{3, 2, 4, 1, 5, 6, 7, 8, 9};

        // Use selection sort to sort it
        int[] sortedNums = selectionSort(nums);

        // Loop through the sorted version and check each item
        for (int i : sortedNums) {
            System.out.println(i);
        }
    }
}
