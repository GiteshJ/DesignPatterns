package BehaviouralDesignPattern.MementoPattern.State;

public class Memento {

	public Memento(String state) {
		super();
		this.state = state;
	}

	private String state;

	public String getState() {
		return this.state;
	}
	
}
