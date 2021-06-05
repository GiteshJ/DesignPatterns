package BehaviouralDesignPattern.MementoPattern.State;

public class Client {

	public static void main(String[] args) {
		
		CareTaker caretaker = new CareTaker();
		Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.add( originator.save() );
        originator.setState("State3");
        caretaker.add( originator.save() );
        originator.setState("State4");
        originator.restore( caretaker.get() );
        originator.restore( caretaker.get() );
	}
}
