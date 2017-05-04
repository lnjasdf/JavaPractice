package pattern.creational.AbstractFactory;

import pattern.creational.Factory.Sender;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public interface Provider {
    Sender produce();
}
