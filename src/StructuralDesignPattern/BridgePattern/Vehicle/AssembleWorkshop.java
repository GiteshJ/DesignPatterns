package StructuralDesignPattern.BridgePattern.Vehicle;

/*
 * Refine abstraction 2 in bridge pattern
 */
public class AssembleWorkshop extends Workshop{

	public AssembleWorkshop(Vehicle vehicle) {
		super(vehicle);
	}
	
	public void work() {
		System.out.print("Assemble Workshop Currently Assembling ");
		vehicle.build();
	}
}

