package BehaviouralDesignPattern.StatePattern.FiniteStateMachine;

public interface State {
	
	default public void on() {System.out.println("error");}
	
	default public void off() {System.out.println("error");}
	
	default public void ack() {System.out.println("error");}

}
