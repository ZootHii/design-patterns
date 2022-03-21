package com.zoothii.observer.example0.listeners;

public class PhoneNotificationListener implements EventListener {

    private final String phoneNumber;

    public PhoneNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, String message) {
        System.out.println("Phone Notification to " + phoneNumber + " for " + eventType + ": " + message);
    }
}
