public class Main {
    public static void main(String[] args) {
        Logger firstLogger = Logger.getInstance();
        Logger secondLogger = Logger.getInstance();

        firstLogger.log("Application started");
        secondLogger.log("User logged in");

        if (firstLogger == secondLogger) {
            System.out.println("Only one logger object is used.");
        }
    }
}

