package com.zoothii.observer.example0.topics;

import com.zoothii.observer.example0.publisher.EventManager;


public class Earthquake {

    public EventManager events;

    public Earthquake() {
        this.events = new EventManager("earthquake-near", "earthquake-take-action");
    }

    public void notifyAllEvents(){
        events.notify();
    }

    public void earthquakeNear(String message) {
        events.notify("earthquake-near", message);
    }

    public void earthquakeTakeAction(String message) {
        events.notify("earthquake-take-action", message);
    }
}
