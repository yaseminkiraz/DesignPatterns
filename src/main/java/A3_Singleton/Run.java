package A3_Singleton;

public class Run {
    public static void main(String[] args){
        EagerInitializationSingleton.getInstance().toText();
        StaticBlockSingleton.getInstance().toText();
        LazySingleton.getInstance().toText();
        ThreadSafeSingleton.getInstance().toText();
        BillPughSingleton.getInstance().toText();
    }
}
