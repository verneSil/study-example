package heapSort;

/**
 * @author verne on 18-2-8.
 * @version 1.0
 */

public class HeapSort {

    public static void srot(int[] array) {
        int length = array.length;
//        initHeap(array, length);
//        arraySwap(array, length-1, 0);
        for (int i = length; i > 0; i--) {
            initHeap(array, i);
            arraySwap(array, i - 1, 0);
        }
    }

    private static void initHeap(int[] array, int length) {
        int len = length; //19
        for (int i = len / 2 - 1; i >= 0; i--) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            if (array[i] < array[left]) arraySwap(array, i, left);
            if (right < len && array[right] > array[i]) arraySwap(array, i, right);
        }
    }

    private static void arraySwap(int[] array, int i, int k) {
        int tmp = array[i];
        array[i] = array[k];
        array[k] = tmp;
    }

}
