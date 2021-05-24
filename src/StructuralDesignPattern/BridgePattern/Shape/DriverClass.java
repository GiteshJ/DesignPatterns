package StructuralDesignPattern.BridgePattern.Shape;

public class DriverClass {
	
	public static void main(String[] args) {
		
		Shape pen = new Pentagon(new RedColor());
		pen.applyColor();
		
		Shape hex = new Hexagon(new BlueColor());
		hex.applyColor();
	}

}
