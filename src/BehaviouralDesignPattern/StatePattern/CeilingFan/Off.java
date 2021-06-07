package BehaviouralDesignPattern.StatePattern.CeilingFan;

public class Off implements State{

	public void pull(CeilingFanPullChain wrapper) {
		wrapper.setState(new Low());
		System.out.println(" Low Speed ");
	}
}
