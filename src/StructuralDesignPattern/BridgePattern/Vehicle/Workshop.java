package StructuralDesignPattern.BridgePattern.Vehicle;


/*
 * abstraction in bridge pattern
 */
public abstract class Workshop {

	Vehicle vehicle;
	
	public Workshop(Vehicle vehicle) {
		this.vehicle= vehicle;
	}
	
	abstract public void work();
}
