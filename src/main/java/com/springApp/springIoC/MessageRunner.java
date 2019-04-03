package com.springApp.springIoC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 Entry point
 @author Ihor Savchenko
 @version 1.0
 */

public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("annotations-jsr250-config.xml");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Message message = (Message) context.getBean("message");
        System.out.println(message.getMessage());

        context.close();

        context =
                new ClassPathXmlApplicationContext("annotations-jsr250-config.xml");

        message = (Message) context.getBean("message");
        System.out.println(message.getMessage());
        Message2 message2 = (Message2) context.getBean("message2");
        System.out.println(message2.getMessage());

        context.close();
    }
}
