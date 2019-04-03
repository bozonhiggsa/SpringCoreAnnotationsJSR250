package com.springApp.springIoC;

import org.springframework.context.annotation.Scope;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message2 {
    private String message;

    public Message2() {
        System.out.println("Constructor of Message2 is performed");
    }

    public String getMessage() {
        return "Message2: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //analog init-method="beanInit" in xml-configuration
    @PostConstruct
    public void beanInit() {
        System.out.println("Bean of Message2 is passing init stage.");
    }

    //analog destroy-method="beanDestroy" in xml-configuration
    @PreDestroy
    public void beanDestroy() {
        System.out.println("Bean of Message2 is passing destroy stage.");
    }
}
