package com.zoothii.observer.example0;

import com.zoothii.observer.example0.listeners.EmailNotificationListener;
import com.zoothii.observer.example0.listeners.PhoneNotificationListener;
import com.zoothii.observer.example0.topics.Earthquake;
import com.zoothii.observer.example0.topics.Party;

public class Main {

    public static void main(String[] args) {
        Earthquake earthquake = new Earthquake();
        Party party = new Party();

        var phoneNotificationListenerUser = new PhoneNotificationListener("5317657601");
        var emailNotificationListenerUser = new EmailNotificationListener("ahmet.zoothii@gmail.com");

        earthquake.events.subscribe("earthquake-near", phoneNotificationListenerUser);
        earthquake.events.unsubscribe("earthquake-near", phoneNotificationListenerUser);
        earthquake.events.subscribe("earthquake-take-action", phoneNotificationListenerUser);
        party.events.subscribe("new-year", emailNotificationListenerUser);

        earthquake.earthquakeNear("There was an earthquake near you!");
        earthquake.earthquakeTakeAction("There was an earthquake take action quickly!");
        party.newYear("Happy New Year");
    }
}
