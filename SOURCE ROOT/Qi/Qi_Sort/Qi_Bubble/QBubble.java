package Qi.Qi_Sort.Qi_Bubble;

public class QBubble {
    /**
     * Sort a given array, nums, using bubble sort
     *
     * @param   nums   An unsorted array of numbers
     * @return  The sorted version of nums
     */
    public static int[] bubbleSort(int[] nums) {
        int sortedIdx = nums.length - 1; // Optimization #2

        for (int i : nums) { // The maximum number of passes is the length of nums

            boolean hasSwapped = false; // Optimization #1

            // Go through everything except for the last item (more explanation in "initial idea")
            for (int j = 0; j < sortedIdx; j++) {

                // If nums[j] and nums[j+1] need swapping, do it.
                if (nums[j] > nums[j+1]) {

                    // Keep a temporary variable of the original nums[j+1] because nums[j+1] will change later
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;

                    hasSwapped = true;
                }
            }

            // Optimization #1, if there were no swaps in the current pass, the array is sorted
            if (!hasSwapped) {
                break;
            }

            sortedIdx--; // Optimization #2
        }
        return nums;
    }

    /**
     * Runs bubbleSort() function on an unsorted array of integers and prints out the result
     *
     * @param args Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        // Use bubble sort to sort [5, 2, 6, 1, 4]
        int[] sorted = bubbleSort(new int[]{5, 2, 6, 1, 4});

        // Print out each separate item
        for (int i : sorted) {
            System.out.println(i);
        }
    }
}
