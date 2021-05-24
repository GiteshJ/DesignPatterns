package StructuralDesignPattern.BridgePattern.Vehicle;

/*
 *  Concrete implementation 1 for bridge pattern
 */
public class Car implements Vehicle{

	public void build() {
		System.out.println("Car.");
	}
}
