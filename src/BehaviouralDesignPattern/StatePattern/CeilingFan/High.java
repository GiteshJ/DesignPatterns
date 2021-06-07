package BehaviouralDesignPattern.StatePattern.CeilingFan;

public class High implements State{
	public void pull(CeilingFanPullChain wrapper) {
		wrapper.setState(new Off());
		System.out.println(" Off Fan ");
	}

}
