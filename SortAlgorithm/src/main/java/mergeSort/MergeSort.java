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

    public static void mySort1(int[] array, int low, int high) {
        int mid = (high + low) / 2;
        if (low < high) {
            mySort1(array,low, mid);
            mySort1(array,mid + 1, high);
            myMerge1(array, low, mid, high);
        }
    }

    private static void myMerge1(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid  + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (array[i] >= array[j]) {
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
            array[l + low] = temp[l];
        }

    }

    public static void mySort2(int[] array, int low, int high) {
        int mid = (high + low) / 2;
        if (low < high) {
            mySort2(array,low, mid);
            mySort2(array,mid + 1, high);
            myMerge2(array, low, mid, high);
        }
    }

    private static void myMerge2(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0 ;
        int temp[] = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (array[i] > array[j]) {
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


    public static void mergeSort3(int[] array, int low, int high) {
        int mid = (low + high) / 2;

        if (low >= high) {
            return;
        }

        mergeSort3(array, low, mid);
        mergeSort3(array, mid + 1, high);
        merge3(array, low, mid, high);
    }

    private static void merge3(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[j++];
            } else {
                temp[k++] = array[i++];
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


    public static void sort4(int[] array, int low, int high) {
        int mid = (low + high) / 2;

        if (low >= high) {
            return;
        }

        sort4(array, low, mid);
        sort4(array, mid + 1, high);

        mergeSort4(array, low, mid, high);

    }

    private static void mergeSort4(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
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


}
