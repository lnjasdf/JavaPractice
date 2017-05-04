package pattern.creational.Factory;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        out.println("this is sms sender!");
    }
}
