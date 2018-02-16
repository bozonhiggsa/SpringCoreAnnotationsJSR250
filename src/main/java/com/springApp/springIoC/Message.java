package com.springApp.springIoC;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
    private String message;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //analog init-method="beanInit" in xml-configuration
    @PostConstruct
    public void beanInit() {
        System.out.println("Bean is passing init stage.");
    }

    //analog destroy-method="beanDestroy" in xml-configuration
    @PreDestroy
    public void beanDestroy() {
        System.out.println("Bean is passing destroy stage.");
    }
}
