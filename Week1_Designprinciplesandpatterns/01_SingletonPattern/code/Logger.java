public class Logger {
    private static Logger logger;
    private int messageCount;

    private Logger() {
        messageCount = 0;
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        messageCount++;
        System.out.println("Log " + messageCount + ": " + message);
    }
}

