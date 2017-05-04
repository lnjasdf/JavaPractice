package pattern.creational.Builder;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public class SmsReceiver implements Receiver {
    @Override
    public void receive() {
        out.println("this is sms receiver!");
    }
}
