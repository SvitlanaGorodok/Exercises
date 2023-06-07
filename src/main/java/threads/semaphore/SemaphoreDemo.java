package threads.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    static Semaphore semaphore = new Semaphore(5);
    public static void main(String[] args) {
        int cars = 15;
        for (int i = 0; i < cars; i++) {
            Thread car = new Thread(() -> {
                try {
                    parking();
                } catch (InterruptedException e) {
                    //NOP
                }
            });
            car.start();
        }

    }

    public static void parking() throws InterruptedException {
        semaphore.acquire();
        System.out.println("Car " + Thread.currentThread().getName() + " arrived at the parking lot");
        Thread.sleep(3000);
        semaphore.release();
        System.out.println("Car " + Thread.currentThread().getName() + " left parking lot");
    }
}
