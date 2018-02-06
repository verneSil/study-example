import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author verne on 18-2-3.
 * @version 1.0
 */

public class TestReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("haha");
        Lock lock = new ReentrantLock();
        lock.lock();
        Condition write = lock.newCondition();
        FutureTask futureTask = new FutureTask(() -> {
            return "gg";
        });
        write.await();
        String o = new String();
        futureTask.run();
        System.out.println("isDone: " + futureTask.isDone());
        try {
            o = (String) futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(o);
        lock.unlock();
    }
}
