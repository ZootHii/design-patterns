package com.zoothii.decorator.example0;

public class Main {

    public static void main(String[] args) {

        Notifier notifier = new ApplicationNotifier("Space");
        System.out.println(notifier.sendNotification("Hello"));

        System.out.println("-------------");
        Notifier notifierDecorator =
                new FacebookNotifierDecorator(
                        new WhatsappNotifierDecorator(
                                new ApplicationNotifier("Ocean")
                        ));

        System.out.println(notifierDecorator.sendNotification("Hello Again"));

        System.out.println("-------------");
        Notifier notifier1 = new ApplicationNotifier("Mars");
        String message = "SA";

        boolean whatsappEnabled = false;
        boolean facebookEnabled = false;
        boolean instagramEnabled = false;

        if (whatsappEnabled) {
            notifier1 = new WhatsappNotifierDecorator(notifier1);
            System.out.println(notifier1.sendNotification(message));
        }
        if (facebookEnabled) {
            notifier1 = new FacebookNotifierDecorator(notifier1);
            System.out.println(notifier1.sendNotification(message));
        }
        if (instagramEnabled) {
            notifier1 = new InstagramNotifierDecorator(notifier1);
            System.out.println(notifier1.sendNotification(message));
        }
        if (!instagramEnabled && !facebookEnabled && !whatsappEnabled) {
            System.out.println(notifier1.sendNotification(message));
        }

        System.out.println("-------------");

        boolean whatsappEnabled2 = true;
        boolean facebookEnabled2 = false;
        boolean instagramEnabled2 = true;

        if (whatsappEnabled2) {
            notifier1 = new WhatsappNotifierDecorator(notifier1);
            System.out.println(notifier1.sendNotification(message));
        }
        if (facebookEnabled2) {
            notifier1 = new FacebookNotifierDecorator(notifier1);
            System.out.println(notifier1.sendNotification(message));
        }
        if (instagramEnabled2) {
            notifier1 = new InstagramNotifierDecorator(notifier1);
            System.out.println(notifier1.sendNotification(message));
        }
        if (!instagramEnabled2 && !facebookEnabled2 && !whatsappEnabled2) {
            System.out.println(notifier1.sendNotification(message));
        }
    }
}
