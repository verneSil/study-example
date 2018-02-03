import threadPool.ThreadPoolDemo;

import java.util.concurrent.ExecutorService;

/**
 * @author verne on 18-2-3.
 * @version 1.0
 */

public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = ThreadPoolDemo.getFixedThreadPool();
    }
}
