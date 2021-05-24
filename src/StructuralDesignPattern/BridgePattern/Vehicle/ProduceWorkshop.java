package StructuralDesignPattern.BridgePattern.Vehicle;


/*
 * Refine abstraction 1 in bridge pattern
 */
public class ProduceWorkshop extends Workshop{

	public ProduceWorkshop(Vehicle vehicle) {
		super(vehicle);
	}
	
	public void work() {
		System.out.print("Prduce Workshop Currently Producing ");
		vehicle.build();
	}
}
