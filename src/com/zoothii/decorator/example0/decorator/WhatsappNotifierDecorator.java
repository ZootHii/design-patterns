package com.zoothii.decorator.example0.decorator;

import com.zoothii.decorator.example0.notifier.Notifier;

public class WhatsappNotifierDecorator extends ApplicationNotifierDecorator {

    private final String name = "Whatsapp";

    public WhatsappNotifierDecorator(Notifier applicationNotifier) {
        super(applicationNotifier);
    }

    @Override
    public String sendNotification(String message) {
        return whatsappNotification(message);
    }

    private String whatsappNotification(String message) {
        return name + ": " + message;
    }
}
