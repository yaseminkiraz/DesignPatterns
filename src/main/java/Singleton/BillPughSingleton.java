package Singleton;

public class BillPughSingleton {
    private BillPughSingleton()
    {
    }

    public static BillPughSingleton getInstance()
    {
        return BillPughSingletonHelper.instance;
    }

    //inner class not load
    // Class loading time is important
    private static class BillPughSingletonHelper
    {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public void toText() {
        System.out.println("Singleton.BillPughSingleton");
    }

}
