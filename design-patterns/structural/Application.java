public class Application {
    public static void main(String[] args) {
        // Logger-Instanz holen und benutzen
        Logger logger = Logger.getInstance();
        logger.log("Application started");

        // Eine andere Stelle in der Anwendung verwendet denselben Logger
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Another part of the application logs this message.");

        // Beide Logger-Instanzen sind identisch
        System.out.println("Are both loggers the same instance? " + (logger == anotherLogger));
    }
}
