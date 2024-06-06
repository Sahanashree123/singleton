package singleton;
public class Client {
    public static void main(String[] args) {
        // Get the single instance of the Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using the logger
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify that both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}