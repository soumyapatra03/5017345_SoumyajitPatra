public class Logger {
    // Private static instance of the class
    private static Logger instance;

    // Private constructor to prevent instantiation from other classes
    private Logger() {
        // Initialization code here, if needed
        {
            System.out.println("Singleton is Instantiated.");
        }
    }

    // Public static method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public static void doSomething() {
        System.out.println("Something is Done.");
    }
}

public class GFG {
    public static void main(String[] args)
    {
        Logger.getInstance().doSomething();
    }
}