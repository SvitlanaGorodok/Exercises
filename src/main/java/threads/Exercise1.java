package threads;

import java.util.List;
import java.util.concurrent.*;

public class Exercise1 {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runnable runnable1 = () -> System.out.println("runnable1");
        Runnable runnable2 = () -> System.out.println("runnable2");
        Callable<String> callable1 = () -> {
            System.out.println("callable1");
            return "callable1";
        };
        Callable<String> callable2 = () -> {
            System.out.println("callable2");
            return "callable2";
        };
        executor.execute(() -> System.out.println("Hello"));
        executor.invokeAll(List.of(callable1, callable2), 5 ,TimeUnit.SECONDS);
        scheduledExecutor.scheduleAtFixedRate(runnable1, 5, 5 ,TimeUnit.SECONDS);
        scheduledExecutor.scheduleWithFixedDelay(runnable2, 5, 5 ,TimeUnit.SECONDS);
    }

}
