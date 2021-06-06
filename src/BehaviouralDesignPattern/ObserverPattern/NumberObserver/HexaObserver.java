package BehaviouralDesignPattern.ObserverPattern.NumberObserver;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		super(subject);
		this.subject.addObserver(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Octal String: " + Integer.toHexString(subject.getState()));

	}

}
