public class DatabaseLogger implements Logger {
    private String connectionString;
    
    public DatabaseLogger(String connectionString) {
        this.connectionString = connectionString;
    }
    
    @Override
    public void log(String message) {
        System.out.println("Database (" + connectionString + "): " + message);
        // Lógica real para salvar no banco de dados seria implementada aqui
    }
}