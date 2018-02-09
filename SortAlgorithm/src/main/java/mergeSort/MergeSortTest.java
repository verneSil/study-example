package mergeSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class MergeSortTest {
    //https://www.cnblogs.com/of-fanruice/p/7678801.html
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray(20);
        MergeSort.mergeSort3(randomArray, 0, randomArray.length - 1 );
        RandomArray.printArray(randomArray);
    }
}