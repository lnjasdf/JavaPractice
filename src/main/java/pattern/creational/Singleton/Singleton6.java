package pattern.creational.Singleton;

/**
 * Created by lnjasdf on 2017/5/5.
 * 线程安全，枚举特性保证
 */
public enum Singleton6 {
    INSTANCE;

    public static Singleton6 getInstance() {
        return INSTANCE;
    }
}
