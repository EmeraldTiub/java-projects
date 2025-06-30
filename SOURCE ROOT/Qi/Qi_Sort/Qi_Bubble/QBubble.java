package Qi.Qi_Sort.Qi_Bubble;

public class QBubble {
    /**
     * Sort a given array, nums, using bubble sort
     *
     * @param   nums   An unsorted array of numbers
     */
    public static void bubbleSort(int[] nums) {
        int sortedIdx = nums.length - 1; // Optimization #3

        for (int i : nums) { // The maximum number of passes is the length of nums

            boolean hasSwapped = false; // Optimization #1
            int recentSwap = sortedIdx;
            // Go through everything except for the last item (more explanation in "initial idea")
            for (int j = 0; j < sortedIdx; j++) {

                // If nums[j] and nums[j+1] need swapping, do it.
                if (nums[j] > nums[j+1]) {

                    // Keep a temporary variable of the original nums[j+1] because nums[j+1] will change later
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;

                    recentSwap = j+1; // Optimization #3

                    hasSwapped = true; // Optimization #1
                }
            }

            // Optimization #1, if there were no swaps in the current pass, the array is sorted
            if (!hasSwapped) {
                break;
            }

            sortedIdx = recentSwap; // Optimization #3
        }
    }

    /**
     * Runs bubbleSort() function on an unsorted array of integers and prints out the result
     *
     * @param args Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        // Use bubble sort to sort [5, 2, 6, 1, 4]
        int[] nums = new int[]{5, 2, 6, 1, 4};
        bubbleSort(nums);

        // Print out each separate item
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
