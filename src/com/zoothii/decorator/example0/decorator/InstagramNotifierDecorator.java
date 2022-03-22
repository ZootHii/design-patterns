package com.zoothii.decorator.example0.decorator;

import com.zoothii.decorator.example0.notifier.Notifier;

public class InstagramNotifierDecorator extends ApplicationNotifierDecorator {

    private final String name = "Instagram";

    public InstagramNotifierDecorator(Notifier applicationNotifier) {
        super(applicationNotifier);
    }

    @Override
    public String sendNotification(String message) {
        return instagramNotification(message);
    }

    private String instagramNotification(String message) {
        return name + ": " + message;
    }
}
