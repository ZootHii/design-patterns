package com.zoothii.observer.example0.topics;

import com.zoothii.observer.example0.publisher.EventManager;

public class Party {

    public EventManager events;

    public Party() {
        this.events = new EventManager("new-year");
    }

    public void newYear(String message) {
        events.notify("new-year", message);
    }
}
