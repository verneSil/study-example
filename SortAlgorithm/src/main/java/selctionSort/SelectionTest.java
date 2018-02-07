package selctionSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class SelectionTest {
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray();
        SelectionSort.selectionSort(randomArray);
        RandomArray.printArray(randomArray);
    }
}
