package singleton;

public class Main {
    public static void main(String[] args) {
        var singleton = Singleton.getInstance();

        System.out.println(singleton.getAndIncrementInt());

        var singleton2 = Singleton.getInstance();

        System.out.println(singleton2.getAndIncrementInt());

    }
}
