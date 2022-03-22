package com.zoothii.decorator.example0.decorator;

import com.zoothii.decorator.example0.notifier.Notifier;

public class FacebookNotifierDecorator extends ApplicationNotifierDecorator {

    private final String name = "Facebook";

    public FacebookNotifierDecorator(Notifier applicationNotifier) {
        super(applicationNotifier);
    }

    @Override
    public String sendNotification(String message) {
        return facebookNotification(message);
    }

    private String facebookNotification(String message) {
        return name + ": " + message;
    }
}
