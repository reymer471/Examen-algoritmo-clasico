public class PrintManager {
    public static void main(String[] args) {
        /**el main y llamo la funcion pa imprimir la data**/
        PrintService printService = new PrintService();

        printService.submitJob("goku", PrintJob.Priority.Y);
        printService.submitJob("vegeta", PrintJob.Priority.R);
        printService.submitJob("frezzer", PrintJob.Priority.E);
        printService.submitJob("fgsfigsgsgfd", PrintJob.Priority.Y);

        printService.processJobs();
    }
}