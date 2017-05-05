package com.test;

import org.junit.Test;
import pattern.creational.AbstractFactory.Provider;
import pattern.creational.AbstractFactory.SendMailFactory;
import pattern.creational.Builder.Phone;
import pattern.creational.Builder.SmsReceiver;
import pattern.creational.Factory.Sender;
import pattern.creational.Factory.SenderFactory;
import pattern.creational.Factory.SmsSender;
import pattern.creational.Prototype.Professor;
import pattern.creational.Prototype.Student;
import pattern.creational.Singleton.Singleton3;

import java.io.IOException;

import static java.lang.System.out;

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

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Professor professor = new Professor("Tom", 30);
        Student student = new Student("Jerry", 20, professor);
        out.println(student);
        Student student1 = (Student)student.clone();
        student1.name = "lily";
        student1.age = 18;
        student1.professor.name = "lucy";
        student1.professor.age = 28;
        out.println(student);
        out.println(student1);
    }

    @Test
    public void testPrototypeDeep() throws CloneNotSupportedException {
        Professor professor = new Professor("Tom", 30);
        Student student = new Student("Jerry", 20, professor);
        out.println(student);
        Student student1 = (Student)student.cloneDeep();
        student1.name = "lily";
        student1.age = 18;
        student1.professor.name = "lucy";
        student1.professor.age = 28;
        out.println(student);
        out.println(student1);
    }

    @Test
    public void testPrototypeSerialize() throws IOException, ClassNotFoundException {
        Professor professor = new Professor("Tom", 30);
        Student student = new Student("Jerry", 20, professor);
        out.println(student);
        Student student1 = (Student)student.cloneSerialize();
        student1.name = "lily";
        student1.age = 18;
        student1.professor.name = "lucy";
        student1.professor.age = 28;
        out.println(student);
        out.println(student1);
    }

}
