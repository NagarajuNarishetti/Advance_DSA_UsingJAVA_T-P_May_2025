import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 2, 9, 1, 5};
        // Outer loop for number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true; // Optimization flag

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if the current element is greater than the next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }

            // If no swaps were made in this pass, array is already sorted
            if (isSorted) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
