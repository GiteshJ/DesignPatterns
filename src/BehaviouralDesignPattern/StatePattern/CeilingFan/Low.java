package BehaviouralDesignPattern.StatePattern.CeilingFan;

public class Low implements State{

	public void pull(CeilingFanPullChain wrapper) {
		wrapper.setState(new Medium());
		System.out.println(" Medium Speed ");
	}
}
