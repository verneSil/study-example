package insertionSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class InsertionTest {
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray();
        InsertionSort.sort(randomArray);
        RandomArray.printArray(randomArray);
    }
}
