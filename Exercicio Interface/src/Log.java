public class Log {
    public static void log(LogLevel level, String message) {
        LogConsole.log(level, message);
        LogFile.log(level, message);
    }
}