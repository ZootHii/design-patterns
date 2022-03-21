package com.zoothii.decorator.example0;

public class InstagramNotifierDecorator extends ApplicationNotifierDecorator {

    public InstagramNotifierDecorator(Notifier applicationNotifier) {
        super(applicationNotifier);
    }

    @Override
    public String sendNotification(String message) {
        return instagramNotification(message);
    }

    public String instagramNotification(String message) {
        return "Instagram: " + message;
    }
}
