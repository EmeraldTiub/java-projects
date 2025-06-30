package Jin.Jin_Sort.Jin_InsertionSort;

public class JInsertionSort {
    /**
     * Sorts the array using insertion sort.
     *
     * @param arr the array of integers to be sorted
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Keep moving the element until it's bigger
            // than the one to the left of it.
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j -= 1;
            }
        }
    }

    /**
     * Tests the insertionSort() method.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 7, 3, 9, 1, 10, 4};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
