package pattern.creational.Singleton;

/**
 * Created by lnjasdf on 2017/5/5.
 * 懒汉，线程安全，双重检查
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
