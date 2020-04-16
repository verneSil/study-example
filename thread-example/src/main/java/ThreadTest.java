import threadPool.ThreadPoolDemo;

import java.util.concurrent.*;

/**
 * @author verne on 18-2-3.
 * @version 1.0
 */

public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = ThreadPoolDemo.getFixedThreadPool();
        fixedThreadPool.execute(() -> {
            System.out.println("fixed Thread pool");
        });
        fixedThreadPool.shutdown();

        ExecutorService cachedThreadPool = ThreadPoolDemo.getCachedThreadPool();
        cachedThreadPool.execute(() -> {
            System.out.println("cached thread pool");
        });
        cachedThreadPool.shutdown();

        ExecutorService schedualThreadPool = ThreadPoolDemo.getSchedualThreadPool();
        schedualThreadPool.execute(() -> {
            System.out.println("schedual thread pool");
        });
        schedualThreadPool.shutdown();

        ExecutorService customerThreadPool = ThreadPoolDemo.getCustomerThreadPool();
        customerThreadPool.execute(() -> {
            System.out.println("customer thread pool");
        });
        Future<String> submit = customerThreadPool.submit(() -> {
            return new String("gggggg");
        });
        int countTimes = 1;
        while (!submit.isDone() && 0 != countTimes++) {
            System.out.println("you have waited for " + countTimes++ + " times");
            try {
                String s = submit.get(1000, TimeUnit.MILLISECONDS);
                System.out.println(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
        customerThreadPool.shutdown();
    }

}
