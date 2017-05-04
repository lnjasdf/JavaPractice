package pattern.creational.Builder;

import pattern.creational.Factory.Sender;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public class Phone {
    private Sender sender;
    private Receiver receiver;

    public static class Builder {
        private Sender sender;
        private Receiver receiver;

        public void setSender(Sender sender) {
            this.sender = sender;
        }

        public void setReceiver(Receiver receiver) {
            this.receiver = receiver;
        }

        public Phone create() {
            Phone phone = new Phone();
            phone.setSender(sender);
            phone.setReceiver(receiver);
            return phone;
        }
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
