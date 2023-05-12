package threads;

import java.util.concurrent.*;

public class Exercise1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("task1");
        Runnable task2 = () -> System.out.println("task2");
        executor.execute(() -> System.out.println("Hello"));
        scheduledExecutor.scheduleAtFixedRate(task1, 5, 5 ,TimeUnit.SECONDS);
        scheduledExecutor.scheduleWithFixedDelay(task2, 5, 5 ,TimeUnit.SECONDS);
    }

}
