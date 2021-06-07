package BehaviouralDesignPattern.StatePattern.CeilingFan;

public class CeilingFanPullChain {
	
	private State current;
	
	public CeilingFanPullChain() {
		current = new Off();
	}
	
	public void setState(State state) {
		this.current = state;
	}
	
	public void pull() {
		this.current.pull(this);
	}

}
