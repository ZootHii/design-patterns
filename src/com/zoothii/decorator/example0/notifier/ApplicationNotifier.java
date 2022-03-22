package com.zoothii.decorator.example0.notifier;

public class ApplicationNotifier implements Notifier {

    private final String from;

    public ApplicationNotifier(String from) {
        this.from = from;
    }

    @Override
    public String sendNotification(String message) {
        return from + ": " + message;
    }
}
