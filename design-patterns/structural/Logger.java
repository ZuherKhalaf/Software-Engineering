public class Logger {
    // Die einzige Instanz der Klasse (statisch)
    private static Logger instance;

    // Privater Konstruktor, um direkte Instanziierung zu verhindern
    private Logger() {
    }

    // Öffentliche Methode, um die Instanz zu erhalten
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Beispielmethode für das Loggen
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

}
