package StructuralDesignPattern.BridgePattern.Vehicle;


/*
 * Refine abstraction 3 in bridge pattern
 */
public class PaintWorkshop extends Workshop{

	public PaintWorkshop(Vehicle vehicle) {
		super(vehicle);
	}
	
	public void work() {
		System.out.print("Paint Workshop Currently Painting ");
		vehicle.build();
	}
}
