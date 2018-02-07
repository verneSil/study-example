package shellSort;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class ShellSort {
    public static void sort(int[] array) {
        int tmp = 0;
        int length = array.length;

        while (true) {
            length = length / 2;
            //do something
            for (int k = 0; k < length; k++) {
                for (int i = k + length; i < array.length; i += length) {
                    for (int j = i; j > k; j -= length) {
                        if (array[j] < array[j - length]) {
                            tmp = array[j - length];
                            array[j - length] = array[j];
                            array[j] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }
            //if break;
            if (length == 1) {
                break;
            }
        }

    }
}
