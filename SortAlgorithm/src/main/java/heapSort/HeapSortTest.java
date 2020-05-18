package heapSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-8.
 * @version 1.0
 */

public class HeapSortTest {
    // https://www.cnblogs.com/chengxiao/p/6129630.html
//    https://blog.csdn.net/u010452388/article/details/81283998
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray(20);
        RandomArray.printArray(randomArray);
        HeapSort.srot(randomArray);
        RandomArray.printArray(randomArray);
        RandomArray.isSorted(RandomArray.ArrayAsc, randomArray);
    }
}
