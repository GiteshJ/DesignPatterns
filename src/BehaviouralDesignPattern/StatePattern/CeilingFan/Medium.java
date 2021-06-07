package BehaviouralDesignPattern.StatePattern.CeilingFan;

public class Medium implements State{

	public void pull(CeilingFanPullChain wrapper) {
		wrapper.setState(new High());
		System.out.println(" High Speed ");
	}
}
