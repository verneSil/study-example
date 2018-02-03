package main;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

/**
 * @author verne on 12/28/17.
 * @version 1.0
 */

public class forkJoinTest extends RecursiveTask<Boolean> {

    int[] arr;

    int searchableElement;

    forkJoinTest(int[] arr,
                 int search) {

        this.arr = arr;

        this.searchableElement = search;

    }

    @Override
    protected Boolean compute() {

        // edited by zuowc on 1/3/18 :
        // not average fork/join
        int mid = (0 + arr.length) / 2 - 3;
        System.out.println(Thread.currentThread()
                .getName() + " says : After splliting the arry length is :: " + arr.length + " Midpoint is " + mid);
        if(arr[mid] == searchableElement) {
            System.out.println(" FOUND !!!!!!!!!");
            return true;
        } else if(mid == 1 || mid == arr.length) {
            System.out.println("NOT FOUND !!!!!!!!!");
            return false;
        } else if(searchableElement < arr[mid]) {
            System.out.println(Thread.currentThread().getName() + " says :: Doing Left-search");
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            forkJoinTest forkTask = new forkJoinTest(left, searchableElement);
            forkTask.fork();
            return forkTask.join();
        } else if(searchableElement > arr[mid]) {
            System.out.println(Thread.currentThread().getName() + " says :: Doing Right-search");
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            forkJoinTest forkTask = new forkJoinTest(right, searchableElement);
            forkTask.fork();
            return forkTask.join();
        }
        return false;
    }
}
