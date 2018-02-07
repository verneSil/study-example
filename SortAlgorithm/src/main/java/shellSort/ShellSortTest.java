package shellSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class ShellSortTest {
    public static void main(String[] args) {
        int[] randomArray = RandomArray.createRandomArray();
        ShellSort.sort(randomArray);
        RandomArray.printArray(randomArray);
    }
}
