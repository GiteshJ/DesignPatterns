package BehaviouralDesignPattern.MementoPattern.State;

import java.util.ArrayList;

public class CareTaker {
	
	ArrayList<Memento> stateList = new ArrayList<>();
	Integer size = -1;
	public void add(Memento m) {
		stateList.add(m);
		size++;
	}
	
	public Memento get(){
		Memento m = stateList.get(size);
		stateList.remove(size);
		size--;
		return m;
		
	}

}
