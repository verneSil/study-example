package bubbleSort;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class BubbleSort {
    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i -1 ; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
