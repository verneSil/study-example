import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintABC {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        Condition canCallB = reentrantLock.newCondition();
        Condition canCallC = reentrantLock.newCondition();
        Condition canCallA = reentrantLock.newCondition();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    reentrantLock.lock();
                    if (i != 0) {
                        MyPrint.print();
                        canCallB.signal();
                        try {
                            canCallA.await(10, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        MyPrint.print();
                        try {
                            canCallA.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    reentrantLock.lock();
                    if (i != 0) {
                        MyPrint.print();
                        canCallC.signal();
                        try {
                            canCallB.await(10, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        MyPrint.print();
                        try {
                            canCallB.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    reentrantLock.lock();
                    if (i != 9) {
                        MyPrint.print();
                        canCallA.signal();
                        try {
                            canCallC.await(10, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        MyPrint.print();
                        canCallA.signal();
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }, "C").start();
    }

    static class MyPrint {
        public static void print() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}



