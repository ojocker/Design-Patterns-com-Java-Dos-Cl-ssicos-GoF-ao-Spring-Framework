public class FileLogger implements Logger {
    private String filePath;
    
    public FileLogger(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public void log(String message) {
        System.out.println("File (" + filePath + "): " + message);
        // Lógica real para escrever em arquivo seria implementada aqui
    }
}