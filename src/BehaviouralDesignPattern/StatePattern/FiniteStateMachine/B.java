package BehaviouralDesignPattern.StatePattern.FiniteStateMachine;

public class B implements State {
	public void on() {
		System.out.println("B + on  = A");
	}

	public void off() {
		System.out.println("B + off = C");
	}

}
