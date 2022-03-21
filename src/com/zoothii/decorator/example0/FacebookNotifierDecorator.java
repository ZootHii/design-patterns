package com.zoothii.decorator.example0;

public class FacebookNotifierDecorator extends ApplicationNotifierDecorator {

    public FacebookNotifierDecorator(Notifier applicationNotifier) {
        super(applicationNotifier);
    }

    @Override
    public String sendNotification(String message) {
        return facebookNotification(message);
    }

    public String facebookNotification(String message) {
        return "Facebook: " + message;
    }
}
