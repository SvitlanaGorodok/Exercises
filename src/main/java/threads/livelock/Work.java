package threads.livelock;

public class Work {
    public synchronized void work(CommonResource resource, Worker mainWorker, Worker otherWorker) {
        while (mainWorker.isActive()) {
            if (resource.getWorker() != mainWorker) {
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            if (otherWorker.isActive()) {
                System.out.println(otherWorker.getName() + " start work with " + mainWorker.getName());
                resource.setWorker(otherWorker);
                continue;
            }

            System.out.println(mainWorker.getName() + " work on resource");
            mainWorker.setActive(false);
            resource.setWorker(otherWorker);
        }
    }
}
