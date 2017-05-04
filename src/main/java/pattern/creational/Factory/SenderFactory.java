package pattern.creational.Factory;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public class SenderFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            out.println("type error");
            return null;
        }
    }
}
