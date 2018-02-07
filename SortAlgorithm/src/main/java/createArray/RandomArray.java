package createArray;

import java.util.Arrays;
import java.util.Random;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class RandomArray {
    public static int a = 0;
    public static int[] createRandomArray() {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] createRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }


    public static int[] createRandomArray(int n, int max) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }
    public static void printArray(int[] randomArray) {
        System.out.println("==================start" + a++ +  "===================");
        Arrays.stream(randomArray).forEach(a -> {
            System.out.print(a + " ");
        });
        System.out.println();
        System.out.println("================== end ===================");
    }


}
