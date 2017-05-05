package pattern.creational.Singleton;

/**
 * Created by lnjasdf on 2017/5/5.
 * 饿汉，线程安全，类加载机制保证
 */
public class Singleton4 {
    private static final Singleton4 instance = new Singleton4();

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
