public class Main {
    public static void main(String[] args) {
        // Obter a instância do LogManager (Singleton)
        LogManager logManager = LogManager.getInstance();
        
        // Adicionar diferentes tipos de loggers
        logManager.addLogger("console", new ConsoleLogger());
        logManager.addLogger("file", new FileLogger("logs.txt"));
        logManager.addLogger("database", new DatabaseLogger("jdbc:mysql://localhost:3306/logs"));
        
        // Usar o LogManager para registrar mensagens
        logManager.logMessage("Teste de logging com padrões de projeto");
        
        // Obter um logger específico e usá-lo diretamente
        Logger consoleLogger = logManager.getLogger("console");
        if (consoleLogger != null) {
            consoleLogger.log("Esta mensagem vai apenas para o console");
        }
    }
}