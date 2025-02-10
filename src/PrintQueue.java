import java.util.PriorityQueue;


public class PrintQueue {
    private final PriorityQueue<PrintJob> queue;


    public PrintQueue() {
        queue = new PriorityQueue<>();
    }


    public void addJob(PrintJob job) {
        queue.add(job);
    }


    public PrintJob getNextJob() {
        return queue.poll();
    }


    public boolean isEmpty() {
        return queue.isEmpty();
    }
}