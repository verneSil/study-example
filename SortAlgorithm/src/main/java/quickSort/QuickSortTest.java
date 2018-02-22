package quickSort;

import createArray.RandomArray;

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
        QuickSort.quickSort5(randomArray, 0, randomArray.length - 1);
        RandomArray.printArray(randomArray);

    }
}
