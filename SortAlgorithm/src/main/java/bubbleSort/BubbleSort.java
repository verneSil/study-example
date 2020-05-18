package bubbleSort;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class BubbleSort {
    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void BubbleSort2(int[] array) {
        for (int f = 0; f < array.length; f++) {
            for (int k = 0; k < array.length - f - 1; k++) {
                if (array[k] < array[k + 1]) {
                    int tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
    }
}
