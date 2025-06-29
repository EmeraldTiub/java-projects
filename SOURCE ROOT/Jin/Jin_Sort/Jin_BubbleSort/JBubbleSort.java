package Jin.Jin_Sort.Jin_BubbleSort;

public class JBubbleSort {
    /**
     * Sorts an array using bubble sort.
     * @param arr the array of integers to be sorted
     * @return the sorted array of integers
     */
    public static int[] bubbleSort(int[] arr) {
        // Create the variables
        int sortedPortion = arr.length - 1;
        Integer latestSwap = null;
        // Pass through the list n times
        for (int i = 0; i < arr.length; i++) {
            // Check each pair
            for (int j = 0; j < sortedPortion; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the two elements
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // Update latestSwap
                    latestSwap = j + 1;
                }
            }
            // If you haven't made any swaps, the array is sorted.
            if (latestSwap == null) {
                break;
            }

            // Update the variables
            sortedPortion = latestSwap;
            latestSwap = null;
        }
        return arr;
    }

    /**
     * Uses the bubbleSort() method on an example array.
     * @param args
     */
    public static void main(String[] args) {
        // Create an example array and use the bubbleSort() function
        int[] arr = {4, 3, 5, 2, 1};
        bubbleSort(arr);
        // Print out each element of arr.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
