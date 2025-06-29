package Jin.Jin_Sort.Jin_SelectionSort;

public class JSelectionSort {
    /**
     * Sorts an array using selection sort.
     *
     * @param arr the array of integers to be sorted
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find out the index of the minimum item in arr.
            int minIdx = i;
            for (int j = minIdx; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Don't redundantly switch the elements if they're the same thing.
            if (arr[i] != arr[minIdx]) {
                // Switch arr[minIdx] with arr[i].
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    /**
     * Tests the selectionSort() method on an example array.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create an example array and call selectionSort() on it.
        int[] arr = {5, 1, 10, 3, 2, 9, 6, 4, 8, 7};
        selectionSort(arr);
        // Print out each element of arr.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
