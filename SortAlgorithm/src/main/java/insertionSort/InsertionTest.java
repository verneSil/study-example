package insertionSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class InsertionTest {
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray();
        RandomArray.printArray(randomArray);
        InsertionSort.sort2(randomArray);
        RandomArray.printArray(randomArray);
        RandomArray.isSorted(RandomArray.ArrayAsc, randomArray);
    }
}
