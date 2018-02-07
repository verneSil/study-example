package createArray;

import java.util.Arrays;
import java.util.Random;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class RandomArray {
    public static int[] createRandomArray() {
        int[] array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            array[i] = random.nextInt(65535);
        }
        return array;
    }

    public static void printArray(int[] randomArray) {
        Arrays.stream(randomArray).forEach(a -> {
            System.out.println(a);
        });
    }


}
