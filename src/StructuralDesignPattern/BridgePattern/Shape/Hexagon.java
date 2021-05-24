package StructuralDesignPattern.BridgePattern.Shape;

/*
 * Refine abstraction 2 in bridge pattern
 */
public class Hexagon  extends Shape{
	
	public Hexagon(Color c) {
		super(c);
	}
	
	@Override
	public void applyColor() {
		System.out.print("Hexagon filled with color ");
		color.fillColor();
	}

}