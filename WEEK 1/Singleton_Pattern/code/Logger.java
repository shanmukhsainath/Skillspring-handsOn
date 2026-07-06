class Logger {

    private static Logger instance;

    String username1;
    String password1;

    String username2;
    String password2;

    // Private constructor
    private Logger() {
        username1 = "admin";
        password1 = "admin123";

        username2 = "user";
        password2 = "user123";
    }

    // Singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Display credentials
    public void displayCredentials() {
        System.out.println("User 1");
        System.out.println("Username: " + username1);
        System.out.println("Password: " + password1);

        System.out.println();

        System.out.println("User 2");
        System.out.println("Username: " + username2);
        System.out.println("Password: " + password2);
    }
}