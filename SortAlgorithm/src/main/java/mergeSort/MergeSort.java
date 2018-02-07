package mergeSort;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class MergeSort {
    public static void sort(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(array,low, mid);
            sort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int start = low;
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= high) {
            temp[k++] = array[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            array[low + l] = temp[l];
        }
    }


}
