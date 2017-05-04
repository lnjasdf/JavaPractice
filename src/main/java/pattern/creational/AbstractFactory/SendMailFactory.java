package pattern.creational.AbstractFactory;

import pattern.creational.Factory.MailSender;
import pattern.creational.Factory.Sender;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
