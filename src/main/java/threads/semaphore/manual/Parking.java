package threads.semaphore.manual;

public class Parking {
    private int freePlaces = 0;
    private int blockedPlaces = 0;
    private final Object monitor = new Object();

    public Parking(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    public void joinParking() throws InterruptedException {
        synchronized (monitor){
            while (blockedPlaces == freePlaces){
                System.out.println("Parking is full...");
                monitor.wait();
            }
            blockedPlaces++;
            monitor.notifyAll();
        }
    }

    public void leaveParking() throws InterruptedException {
        synchronized (monitor){
            while (blockedPlaces == 0){
                monitor.wait();
            }
            blockedPlaces--;
            monitor.notifyAll();
        }
    }
}
