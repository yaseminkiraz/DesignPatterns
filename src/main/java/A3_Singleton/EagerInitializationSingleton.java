package A3_Singleton;

public class EagerInitializationSingleton {
    //Not Thread Safe
    private static final EagerInitializationSingleton ourInstance = new EagerInitializationSingleton();

    //private constructor
    private EagerInitializationSingleton() {
    }

    public static EagerInitializationSingleton getInstance() {
        return ourInstance;
    }

    public void toText() {
        System.out.println("A3_Singleton.EagerInitializationSingleton");
    }
}
