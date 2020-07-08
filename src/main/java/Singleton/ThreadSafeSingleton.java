package Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton ourInstance;

    private  ThreadSafeSingleton(){}

    //synchronized: reserved key
    //performance-related issues due to thread safety
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(ourInstance==null)
            ourInstance = new ThreadSafeSingleton();
        return ourInstance;
    }

    public void toText() {
        System.out.println("Singleton.ThreadSafeSingleton");
    }
}
