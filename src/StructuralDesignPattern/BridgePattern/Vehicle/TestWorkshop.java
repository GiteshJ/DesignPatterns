package StructuralDesignPattern.BridgePattern.Vehicle;


/*
 * Refine abstraction 4 in bridge pattern
 */
public class TestWorkshop extends Workshop{

	public TestWorkshop(Vehicle vehicle) {
		super(vehicle);
	}
	
	public void work() {
		System.out.print("Test Workshop Currently Testing ");
		vehicle.build();
	}
}
