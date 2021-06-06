package BehaviouralDesignPattern.ObserverPattern.EventObserver;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}