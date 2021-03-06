package com.springApp.springIoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    public Message() {
        System.out.println("Constructor of Message is performed");
    }

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //analog init-method="beanInit" in xml-configuration
    @PostConstruct
    public void beanInit() {
        System.out.println("Bean of Message is passing init stage.");
    }

    //analog destroy-method="beanDestroy" in xml-configuration
    @PreDestroy
    public void beanDestroy() {
        System.out.println("Bean of Message is passing destroy stage.");
    }
}
