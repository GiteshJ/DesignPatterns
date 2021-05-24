package StructuralDesignPattern.BridgePattern.Shape;

/*
 * abstraction in bridge pattern
 */
public abstract class Shape {
	
	Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
