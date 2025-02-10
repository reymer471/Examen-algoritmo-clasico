import java.time.LocalDateTime;


public class PrintJob implements Comparable<PrintJob> {
    private final String user;
    private final LocalDateTime timestamp;
    private final Priority prioridad;

  /**
   *numero de prioridades
   * */
    public enum Priority {
        R, E, Y
    }

/**
 * construtor
 * **/
    public PrintJob(String user, LocalDateTime timestamp, Priority prioridad) {
        this.user = user;
        this.timestamp = timestamp;
        this.prioridad = prioridad;
    }

/**
 * Getter and Setter and printjob
 * **/
    public PrintJob(String user, LocalDateTime timestamp) {
        this(user, timestamp, Priority.E);
    }

    public String getUser() {
        return user;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public Priority getPriority() {
        return prioridad;
    }
/**
 * compare para definir prioridades
 * **/
    @Override
    public int compareTo(PrintJob other) {
        if (this.prioridad != other.prioridad) {
            return other.prioridad.ordinal() - this.prioridad.ordinal();
        }
        return this.timestamp.compareTo(other.timestamp);
    }
/**
 * funcion para imprimir mis users en la de manager
 * */
    @Override
    public String toString() {
        return "PrintJob{" +
                "El user :='" + user + '\'' +
                ", timestamp :=" + timestamp +
                ", Prioridad :=" + prioridad +
                '}';
    }
}