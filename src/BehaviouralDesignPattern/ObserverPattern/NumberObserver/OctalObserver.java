package BehaviouralDesignPattern.ObserverPattern.NumberObserver;

public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		super(subject);
		this.subject.addObserver(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));

	}

}
