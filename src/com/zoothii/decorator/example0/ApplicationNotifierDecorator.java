package com.zoothii.decorator.example0;

public abstract class ApplicationNotifierDecorator implements Notifier {

    private final Notifier decorator;

    public ApplicationNotifierDecorator(Notifier decorator) {
        this.decorator = decorator;
    }

    @Override
    public String sendNotification(String message) {
        return decorator.sendNotification(message);
    }
}
