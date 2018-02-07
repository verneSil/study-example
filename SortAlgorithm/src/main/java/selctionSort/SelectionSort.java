package selctionSort;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class SelectionSort {
    public static void selectionSort(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = i; j < randomArray.length; j++) {
                if (randomArray[i] < randomArray[j]) {
                    int tmp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = tmp;
                }
            }
        }
    }
}
