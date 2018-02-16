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

        Message message = (Message) context.getBean("message");
        System.out.println(message.getMessage());

        context.registerShutdownHook();
    }
}
