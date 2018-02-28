package Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Retention(RetentionPolicy.RUNTIME  )
public @interface Test {
    public static void main(String[] args) {
        Executors.newFixedThreadPool();
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool();


        new ThreadPoolExecutor()
    }
}
