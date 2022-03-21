package com.zoothii.observer.example0.publisher;

import com.zoothii.observer.example0.listeners.EventListener;

import java.util.*;

public class EventManager {

    Map<String, List<EventListener>> eventListeners = new HashMap<>();

    public EventManager(String... eventTypes) {
        for (String eventType : eventTypes) {
            var listenerUsers = new ArrayList<EventListener>();
            this.eventListeners.put(eventType, listenerUsers);
        }
    }

    public void subscribe(String eventType, EventListener listenerUser) {
        List<EventListener> listenerUsers = eventListeners.get(eventType);
        listenerUsers.add(listenerUser);
    }

    public void unsubscribe(String eventType, EventListener listenerUser) {
        List<EventListener> listenerUsers = eventListeners.get(eventType);
        listenerUsers.remove(listenerUser);
    }

    public void notify(String eventType, String message) {
        List<EventListener> listenerUsers = eventListeners.get(eventType);
        for (EventListener listenerUser : listenerUsers) {
            listenerUser.update(eventType, message);
        }
    }

//    public void notifyAllEvents() {
//        Collection<List<EventListener>> listenerUsersCollection = eventListeners.values();
//        listenerUsersCollection.forEach(eventListeners1 -> eventListeners1.forEach(listener -> listener.update("")));
//
//
//        for (EventListener listenerUser : listenerUsers) {
//            listenerUser.update(eventType);
//        }
//    }
}