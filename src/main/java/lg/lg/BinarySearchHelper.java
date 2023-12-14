package lg.lg;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchHelper {
    private List<Integer> indices = new ArrayList<>();

    public void search(int[] arr, int number) {
        helperRec(arr, number, 0, arr.length - 1);
    }

    private void helperRec(int[] arr, int number, int firstIndex, int lastIndex) {
        if (lastIndex < firstIndex) return;

        int mid = (firstIndex + lastIndex) / 2;

        if (arr[mid] == number) {
            for (int i = mid; i >= 0 && arr[i] == number; indices.add(i--));
            for (int i = mid + 1; i < arr.length && arr[i] == number; indices.add(i++));
            return;
        }

        helperRec(arr, number, arr[mid] < number ? mid + 1 : firstIndex, arr[mid] < number ? lastIndex : mid - 1);
    }

    public List<Integer> getIndices() {
        return indices;
    }

    public static void main(String[] args) {
        BinarySearchHelper binarySearchHelper = new BinarySearchHelper();
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6};
        int numberToFind = 5;

        binarySearchHelper.search(arr, numberToFind);

        List<Integer> indices = binarySearchHelper.getIndices();
        System.out.println(indices.isEmpty() ? "Number not found in the array." : "Indices of occurrences: " + indices);
    }
}
