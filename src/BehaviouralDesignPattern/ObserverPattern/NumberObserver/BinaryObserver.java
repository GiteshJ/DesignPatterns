package BehaviouralDesignPattern.ObserverPattern.NumberObserver;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		super(subject);
		this.subject.addObserver(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Octal String: " + Integer.toBinaryString(subject.getState()));

	}

}
