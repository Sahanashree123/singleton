package singleton;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;
    private Logger() {
        try {
            FileWriter fileWriter = new FileWriter("log.txt", false);
            writer = new PrintWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to return the single instance of the Logger
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        
        writer.println("Log: " + message);
        writer.flush();
    }
    
}