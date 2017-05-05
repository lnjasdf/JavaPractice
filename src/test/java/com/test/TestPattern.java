package com.test;

import org.junit.Test;
import pattern.creational.AbstractFactory.Provider;
import pattern.creational.AbstractFactory.SendMailFactory;
import pattern.creational.Builder.Phone;
import pattern.creational.Builder.SmsReceiver;
import pattern.creational.Factory.Sender;
import pattern.creational.Factory.SenderFactory;
import pattern.creational.Factory.SmsSender;
import pattern.creational.Singleton.Singleton3;

/**
 * Created by lnjasdf on 2017/5/4.
 */
public class TestPattern {
    public static void main(String[] args) {

    }

    @Test
    public void testSimpleFactory() {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("sms");
        sender.send();
    }

    @Test
    public void testAbstractFactory() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }

    @Test
    public void testBuilder() {
        Phone.Builder builder = new Phone.Builder();
        builder.setSender(new SmsSender());
        builder.setReceiver(new SmsReceiver());
        Phone smsPhone = builder.create();
        smsPhone.getSender().send();
        smsPhone.getReceiver().receive();
    }

    @Test
    public void testSingleton() {
        Singleton3 instance = Singleton3.getInstance();
    }
}
