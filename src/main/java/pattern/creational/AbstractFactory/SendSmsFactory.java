package pattern.creational.AbstractFactory;

import pattern.creational.Factory.Sender;
import pattern.creational.Factory.SmsSender;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
