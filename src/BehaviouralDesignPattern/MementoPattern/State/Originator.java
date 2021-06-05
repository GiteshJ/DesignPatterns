package BehaviouralDesignPattern.MementoPattern.State;

public class Originator {
	
	public Originator() {
		super();
		
	}

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}
	
	public Memento save() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(this.state);
		
	}
	
	public void restore(Memento m) {
		this.state = m.getState();
		System.out.println("Originator: State after restoring from Memento: " + state);
	}
	
	

}
