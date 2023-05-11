package threads.livelock;

public class CommonResource {
    private Worker worker;

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public CommonResource(Worker worker) {
        this.worker = worker;
    }
}
