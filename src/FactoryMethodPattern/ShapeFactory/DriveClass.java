package FactoryMethodPattern.ShapeFactory;

public class DriveClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeometricShape line = ShapeFactory.getShape(ShapeType.LINE);
		line.draw();
		
		GeometricShape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();
		
		GeometricShape square = ShapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
	}

}
