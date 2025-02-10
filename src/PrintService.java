public class PrintService {
    private final PrintQueue printQueue;


    public PrintService() {
        this.printQueue = new PrintQueue();
    }

    public void submitJob(String user, PrintJob.Priority prioridad) {
        PrintJob job = new PrintJob(user, java.time.LocalDateTime.now(), prioridad);
        printQueue.addJob(job);
        System.out.println("Job mandado: " + job);
    }

    public void submitJob(String user) {
        submitJob(user, PrintJob.Priority.E);
    }

    public void processJobs() {
        while (!printQueue.isEmpty()) {
            PrintJob job = printQueue.getNextJob();
            System.out.println("procesando job: " + job);
        }
    }
}