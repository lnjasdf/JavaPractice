package pattern.creational.Singleton;

/**
 * Created by lnjasdf on 2017/5/5.
 * 懒汉，线程安全，类加载机制保证，调用 getInstance 时才加载 SingletonHolder，才实例化 instance
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 instance = new Singleton5();
    }

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }
}
