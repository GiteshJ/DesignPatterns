package BehaviouralDesignPattern.StatePattern.FiniteStateMachine;

public class FSM {

	private State[] states = { new A(), new B(), new C() };

	private int[][] transition = { { 2, 1, 0 }, { 0, 2, 1 }, { 1, 2, 2 } };

	int current = 0;

	public void next(int msg) {
		this.current = transition[current][msg];
	}

	 public void on() {
		 this.states[current].on();
		 next(0);
	}

	 public void off() {
		 this.states[current].off();
		 next(1);
	}

	 public void ack() {
		 this.states[current].ack();
		 next(2);
	}
}
