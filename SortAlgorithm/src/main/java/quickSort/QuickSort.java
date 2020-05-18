package quickSort;

import createArray.RandomArray;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class QuickSort {

    public static int flag = 0;

    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];


        while (end > start) {
            //从后往前比较
            while (end > start && a[end] >= key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
            {
                end--;
            }
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            if (flag < 1) {
                System.out.println("后面");
                System.out.println("start: " + start);
                System.out.println("end: " + end);
                System.out.println("key: " + key);
                RandomArray.printArray(a);
            }
            //从前往后比较
            while (end > start && a[start] <= key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
            {
                start++;
            }
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            if (flag < 1) {
                System.out.println("前面");
                System.out.println("start: " + start);
                System.out.println("end: " + end);
                System.out.println("key: " + key);
                RandomArray.printArray(a);
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        flag++;
        RandomArray.printArray(a);
        //递归
        if (start > low) {
            sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        }
        if (end < high) {
            sort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
        }
    }

    public static void mySort1(int[] array1, int low, int high) {
        if (low >= high) {

            return;
        }

        int start = low;
        int end = high;
        int key = array1[start];
        while (start < end) {
            while (start < end && array1[end] <= key) { //找到第一个比key小的数字
                end--;
            }
            if (array1[end] > key) {
                int tmp = array1[end];
                array1[end] = array1[start];
                array1[start] = tmp;
            }

            while (start < end && array1[start] >= key) { //从前找第一个比key小的数字
                start++;
            }
            if (array1[start] < key) {
                int tmp = array1[start];
                array1[end] = array1[start];
                array1[start] = tmp;
            }
        }
        array1[start] = key;
        if (start > low) {
            mySort1(array1, low, start - 1);
        }
        if (end < high) {
            mySort1(array1, end + 1, high);
        }

    }

    public static void mySort2(int[] array, int low, int high) {

        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int key = array[low];

        System.out.println(".");
        while (start < end) {
            System.out.println("?");
            while (start < end && array[end] > key) {
                end--;
            }

            if (array[end] < array[start]) {
                int tmp = array[end];
                array[end] = array[start];
                array[start] = tmp;
            }

            while (start < end && array[start] <= key) {
                start++;
            }

            if (array[start] > array[end]) {
                int tmp = array[end];
                array[end] = array[start];
                array[start] = tmp;
            }
        }

        array[start] = key;

        if (low < start) {
            mySort2(array, low, start - 1);
        }

        if (high > end) {
            mySort2(array, end + 1, high);
        }
    }

    public static void mySort3(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int key = array[low];

        while (start < end) {

            while (start < end && array[end] >= key) {
                end--;
            }

            if (array[end] < array[start]) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }

            while (start < end && array[start] <= key) {
                start++;
            }

            if (array[end] < array[start]) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }

        array[end] = key;

        if (start > low) {
            mySort3(array, low, start - 1);
        }
        if (end < high) {
            mySort3(array, end + 1, high);
        }
    }


    public static void quickSort4(int[] array, int low, int high) {

        int k = array[low];
        int start = low;
        int end = high;
        while (start < end) {
            while (start < end && array[end] >= k) {
                end--;
            }

            if (array[end] < array[start]) {
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }

            while (start < end && array[start] <= k) {
                start++;
            }

            if (array[end] < array[start]) {
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
            }
        }
        array[end] = k;
        if (start > low) {
            quickSort4(array, low, start - 1);
        }
        if (end < high) {
            quickSort4(array, end + 1, high);
        }

    }


    public static void quickSort5(int[] array, int start, int end) {
        int head = start;
        int tail = end;
        int key = array[start];

        while (head < tail) {
            while (head < tail && array[tail] >= key) {
                tail--;
            }
            if (array[tail] < array[head]) {
                int temp = array[tail];
                array[tail] = array[head];
                array[head] = temp;
            }

            while (head < tail && array[head] <= key) {
                head++;
            }

            if (array[head] < array[head]) {
                int temp = array[tail];
                array[tail] = array[head];
                array[head] = temp;
            }
        }
        array[tail] = key;
        if (head > start) {
            quickSort5(array, start, head - 1);
        }
        if (tail < end) {
            quickSort5(array, tail + 1, end);
        }
    }

    public static void quickSort6(int[] array) {
        int start = 0;
        int end = array.length - 1;
        doQuickSort(array, start, end);
    }

    private static void doQuickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int head = start;
        int tail = end;
        int exam = array[start];// 这只是一个基准
        while (head < tail) {
            while (head < tail && array[tail] >= exam) {
                tail--;
            }
            if (array[head] > array[tail]) {
                RandomArray.swapArray(array, head, tail);
            }

            while (head < tail && array[head] <= exam) {
                head++;
            }
            if (array[head] > array[tail]) {
                RandomArray.swapArray(array, head, tail);
            }


        }

        if (head > start) {
            doQuickSort(array, start, head - 1);
        }
        if (tail < end) {
            doQuickSort(array, tail + 1, end);
        }
    }
}
