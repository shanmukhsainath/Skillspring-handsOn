public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.displayCredentials();

        System.out.println();

        if (logger1 == logger2) {
            System.out.println("Singleton Pattern Verified!");
            System.out.println("logger1 and logger2 refer to the same Logger object.");
        }
    }
}