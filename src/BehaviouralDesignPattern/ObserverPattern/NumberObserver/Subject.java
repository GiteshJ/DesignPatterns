package BehaviouralDesignPattern.ObserverPattern.NumberObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers;
	
	private int state ;
	
	
	public Subject() {
		
		observers = new ArrayList<Observer>();
	}
	
	public Subject(int state) {
		this.state = state;
		observers = new ArrayList<Observer>();
	}
	
	public void setState(int state) {
		this.state = state;
		this.notifyAllObserver();
	}
	
	public int getState() {
		return this.state;
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void notifyAllObserver() {
		observers.stream().forEach(observer -> observer.update());
	}

}
