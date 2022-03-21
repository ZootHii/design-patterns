package com.zoothii.observer.example0.listeners;

public class EmailNotificationListener implements EventListener {

    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Email to " + email + " for " + eventType + ": " + message);
    }
}