package lessmovearrays;

import java.util.Random;

// 没有写出来.不管了....:)
public class LessMoveTest {

    public static void main(String[] args) {
        int[] elements = initElement();
        print(elements);
        int n = findResult(elements);
        print(elements);
        System.out.println(n);

    }

    private static void print(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("->" + elements[i]);
        }
        System.out.println();
    }

    private static int findResult(int[] elements) {
        int n = elements.length;
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < elements[i]) {
                max = elements[i];
            }
            if (min > elements[i]) {
                min = elements[i];
            }
            sum += elements[i];
        }
        return sum - min * n;
    }

    private static int[] initElement() {
        Random random = new Random();
        int i = random.nextInt(100);
        int[] element = new int[i];
        for (int j = 0; j < element.length; j++) {
            element[j] = random.nextInt(1000);

        }
        return element;
    }

}

