package main.example;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

// 计算1++++++1000;
public class SumExampleTest {

   public static void main(String[] args) {
      ForkJoinPool forkJoinPool = new ForkJoinPool(10);
      SumTask sumTask = new SumTask(1, 1000);
      Integer invoke = forkJoinPool.invoke(sumTask);
      forkJoinPool.shutdown();
      System.out.println(invoke.intValue());
   }

   private static class SumTask extends RecursiveTask<Integer> {
      private int from;
      private int to;

      public SumTask(int from, int to) {
         this.from = from;
         this.to = to;
      }

      @Override
      protected Integer compute() {
         int mid = (from + to) / 2;
         if (mid - from > 50) {
            ForkJoinTask left = new SumTask(from, mid).fork();
            ForkJoinTask right = new SumTask(mid + 1, to).fork();
            return (Integer) left.join() + (Integer) right.join();
         } else {
            int sum = 0;
            for (int i = from; i <= to; i++) {
               sum += i;
            }
            return sum;
         }
      }
   }
}

