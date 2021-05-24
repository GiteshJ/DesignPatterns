package StructuralDesignPattern.BridgePattern.Shape;

/*
 *  Concrete implementation 1 for bridge pattern
 */
public class RedColor implements Color{

	public void fillColor() {
		System.out.println(" RED.");
	}
}
