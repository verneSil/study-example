package mergeSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class MergeSortTest {
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray(20);
        MergeSort.sort(randomArray, 0, randomArray.length - 1);
        RandomArray.printArray(randomArray);
    }
}
