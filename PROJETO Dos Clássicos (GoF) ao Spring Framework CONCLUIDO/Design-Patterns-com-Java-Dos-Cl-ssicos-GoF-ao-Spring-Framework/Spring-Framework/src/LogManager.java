import java.util.HashMap;
import java.util.Map;

public class LogManager {
    private static LogManager instance;
    private Map<String, Logger> loggers = new HashMap<>();
    
    private LogManager() {
        // Construtor privado para implementar Singleton
    }
    
    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }
    
    public void addLogger(String name, Logger logger) {
        loggers.put(name, logger);
    }
    
    public Logger getLogger(String name) {
        return loggers.get(name);
    }
    
    public void logMessage(String message) {
        for (Logger logger : loggers.values()) {
            logger.log(message);
        }
    }
}