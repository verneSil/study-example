package heapSort;

import createArray.RandomArray;

import java.util.Random;

/**
 * @author verne on 18-2-8.
 * @version 1.0
 */

public class HeapSortTest {
    // https://www.cnblogs.com/chengxiao/p/6129630.html
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray(20);
        RandomArray.printArray(randomArray);
        HeapSort.srot(randomArray);
        RandomArray.printArray(randomArray);
    }
}
