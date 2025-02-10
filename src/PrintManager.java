public class PrintManager {
    public static void main(String[] args) {
        /**el main y llamo la funcion pa imprimir la data**/
        PrintService printService = new PrintService();

        printService.submitJob("goku", PrintJob.Priority.H);
        printService.submitJob("vegeta", PrintJob.Priority.L);
        printService.submitJob("frezzer", PrintJob.Priority.M);
        printService.submitJob("fgsfigsgsgfd", PrintJob.Priority.H);

        printService.processJobs();
    }
}