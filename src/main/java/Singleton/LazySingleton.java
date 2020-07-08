package Singleton;

public class LazySingleton {
    private static LazySingleton ourInstance;

    private LazySingleton(){}

    //Not Thread Safe
    public static LazySingleton getInstance()
    {
        if(ourInstance==null)
            ourInstance = new LazySingleton();
        return ourInstance;
    }

    public void toText() {
        System.out.println("Singleton.LazySingleton");
    }
}
