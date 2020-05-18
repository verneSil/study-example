package selctionSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class SelectionTest {
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray(20, 10000);
        RandomArray.printArray(randomArray);
        SelectionSort.selectionSort(randomArray);
        RandomArray.printArray(randomArray);
        RandomArray.isSorted(RandomArray.ArrayDesc, randomArray);
    }
}
