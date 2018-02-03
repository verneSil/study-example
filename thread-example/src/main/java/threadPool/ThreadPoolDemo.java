package threadPool;

import java.util.concurrent.*;

/**
 * @author verne on 18-2-3.
 * @version 1.0
 */

public class ThreadPoolDemo {

    public static ExecutorService getFixedThreadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        return executorService;
    }

    public static ExecutorService getCachedThreadPool() {
        return Executors.newCachedThreadPool();
    }

    public static ExecutorService getSchedualThreadPool() {
        return Executors.newScheduledThreadPool(100);
    }



    public static ExecutorService getCustomerThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor( 25,25,0L, TimeUnit.MILLISECONDS, new
                LinkedBlockingQueue<Runnable>(15));
        return threadPoolExecutor;
    }
}
