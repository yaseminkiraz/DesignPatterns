package A3_Singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton ourInstance;

    //Not Thread Safe
    //Exception handling with try catch
    static {
        try{
            ourInstance = new StaticBlockSingleton();
        }
        catch (Exception e)
        {
            System.out.println("A3_Singleton.StaticBlockSingleton exception.");
        }
    }

    private StaticBlockSingleton()
    {
    }

    public static StaticBlockSingleton getInstance()
    {
        return ourInstance;
    }

    public void toText() {
        System.out.println("A3_Singleton.StaticBlockSingleton");
    }
}
