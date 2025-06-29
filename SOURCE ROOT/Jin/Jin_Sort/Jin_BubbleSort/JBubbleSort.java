package Jin.Jin_Sort.Jin_BubbleSort;

public class JBubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int sortedPortion = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sortedPortion; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 3, 1};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
