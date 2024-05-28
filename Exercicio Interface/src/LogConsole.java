import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogConsole {
    public static void log(LogLevel level, String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String timestamp = dtf.format(now);

        switch (level) {
            case DEBUG:
                System.out.println("\033[32m" + timestamp + " [DEBUG] " + message + "\033[0m");
                break;
            case WARNING:
                System.out.println("\033[33m" + timestamp + " [WARNING] " + message + "\033[0m");
                break;
            case ERROR:
                System.out.println("\033[31m" + timestamp + " [ERROR] " + message + "\033[0m");
                break;
        }
    }
}