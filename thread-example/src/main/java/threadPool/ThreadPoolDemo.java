package threadPool;

import java.util.concurrent.*;

/**
 * @author verne on 18-2-3.
 * @version 1.0
 */

public class ThreadPoolDemo {

    public static ExecutorService getFixedThreadPool() {

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        executorService.submit(() -> {
            System.out.println("asdfadf");
        });
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(25, Integer.MAX_VALUE, 1000, TimeUnit.MILLISECONDS, new
                LinkedBlockingDeque<Runnable>(1024));
        threadPoolExecutor.submit(() -> {
            System.out.println("hahahahah");
        });
        threadPoolExecutor.shutdown();
        executorService.shutdown();
        return executorService;
    }
}
