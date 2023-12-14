package lg.lg;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        // Sorting the array using Bubble Sort
        bubbleSort(arr);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;

                    // Set swapped to true so the loop continues
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
