package threads.semaphore.manual;

public class ParkingDemo {
    static Parking parking = new Parking(5);
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
        parking.joinParking();
        System.out.println("Car " + Thread.currentThread().getName() + " arrived at the parking lot");
        Thread.sleep(3000);
        parking.leaveParking();
        System.out.println("Car " + Thread.currentThread().getName() + " left parking lot");
    }
}
