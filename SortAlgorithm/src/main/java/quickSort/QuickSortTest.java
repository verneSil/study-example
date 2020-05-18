package quickSort;

import createArray.RandomArray;
import heapSort.HeapSort;

import java.util.Arrays;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class QuickSortTest {
    //http://blog.csdn.net/justperseve/article/details/51279407
    public static void main(String[] args) {
//        int[] randomArray = RandomArray.createRandomArray(10);
//        System.out.println("original:");
//        RandomArray.printArray(randomArray);
//        System.out.println("===========================================================================");
//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(randomArray,0,randomArray.length - 1);
//        RandomArray.printArray(randomArray);
        int[] randomArray = RandomArray.createRandomArray(25);
        RandomArray.printArray(randomArray);
        int[] ints = Arrays.copyOf(randomArray, randomArray.length);
        QuickSort.quickSort6(randomArray);
        RandomArray.printArray(randomArray);
        HeapSort.srot(ints);
        RandomArray.printArray(ints);

    }
}
