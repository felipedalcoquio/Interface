import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogFile {
    private static final String FILE_NAME = "log.txt";

    public static void log(LogLevel level, String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String timestamp = dtf.format(now);

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(timestamp + " [" + level + "] " + message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}