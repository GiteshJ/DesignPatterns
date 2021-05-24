package StructuralDesignPattern.BridgePattern.Vehicle;


/*
 *  Concrete implementation 2 for bridge pattern
 */
public class Bike implements Vehicle{

	public void build() {
		System.out.println("Bike.");
	}
}
