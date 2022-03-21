package com.zoothii.decorator.example0;

public class WhatsappNotifierDecorator extends ApplicationNotifierDecorator {

    public WhatsappNotifierDecorator(Notifier applicationNotifier) {
        super(applicationNotifier);
    }

    @Override
    public String sendNotification(String message) {
        return whatsappNotification(message);
    }

    public String whatsappNotification(String message) {
        return "Whatsapp: " + message;
    }
}
