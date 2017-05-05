package pattern.creational.Singleton;

/**
 * Created by lnjasdf on 2017/5/5.
 * 懒汉，线程安全
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {

    }

    synchronized public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
