package insertionSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] > array[j - 1]) {
                    int tmp = 0;
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}
