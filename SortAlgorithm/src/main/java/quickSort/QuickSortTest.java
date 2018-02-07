package quickSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class QuickSortTest {
    public static void main(String[] args) {
//        int[] randomArray = RandomArray.createRandomArray(10);
//        System.out.println("original:");
//        RandomArray.printArray(randomArray);
//        System.out.println("===========================================================================");
//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(randomArray,0,randomArray.length - 1);
//        RandomArray.printArray(randomArray);
        int[] randomArray = RandomArray.createRandomArray(1000,65535);
        QuickSort.mySort1(randomArray, 0, randomArray.length - 1);

        RandomArray.printArray(randomArray);

    }
}
