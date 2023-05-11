package threads.deadlock;

public class Deadlock {
    private static final Object MONITOR1 = new Object();
    private static final Object MONITOR2 = new Object();


    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> lock1());
        thread1.start();

        Thread thread2 = new Thread(() -> lock2());
        thread2.start();

    }

    public static void lock1() {
        synchronized (MONITOR1) {
            try {
                System.out.println(Thread.currentThread().getName() + "lock monitor 1");
                Thread.sleep(1000);
                synchronized (MONITOR2) {
                    System.out.println(Thread.currentThread().getName() + "lock monitor 2");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lock2() {
        synchronized (MONITOR2) {
            try {
                System.out.println(Thread.currentThread().getName() + "lock monitor 2");
                Thread.sleep(1000);
                synchronized (MONITOR1) {
                    System.out.println(Thread.currentThread().getName() + "lock monitor 1");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
