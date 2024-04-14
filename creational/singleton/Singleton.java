package singleton;

public class Singleton {

    //Making it volatile so that partial created object can be handle properly
    private static volatile Singleton obj;

    private int count = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (obj == null) {
            // For making thread safe
            synchronized (Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                }
            }
        }

        return obj;
    }

    public int getAndIncrementInt() {
        return ++count;
    }

}
