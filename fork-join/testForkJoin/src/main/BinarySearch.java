package main;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * @author verne on 12/28/17.
 * @version 1.0
 */

public class BinarySearch {

    int[] arr = new int[65535];

    public BinarySearch()

    {

        init();

    }

    private void init()

    {

        for(int i = 0 ; i<arr.length;i++)

        {
            arr[i] = i;
        }

        Arrays.sort(arr);

    }

    public void createForJoinPool(int search)

    {

        ForkJoinPool forkJoinPool = new ForkJoinPool(50);

        forkJoinTest searcher = new forkJoinTest(this.arr,search);

        Boolean status = forkJoinPool.invoke(searcher);

        System.out.println(" Element ::" + search +" has been found in array? :: " + status );

    }

    public static void main(String[] args) {

        BinarySearch search = new BinarySearch();

        search.createForJoinPool(999);

        System.out.println("**********************");

        search.createForJoinPool(23475);

    }
}
