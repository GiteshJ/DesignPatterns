package CreationalDesignPattern.FactoryMethodPattern.ShapeFactory;

public class ShapeFactory {
	
	public static GeometricShape getShape(ShapeType type) {
		
		GeometricShape shape = null;
		
		switch(type) {
			case LINE:
				shape = new Line();
				break;
			case CIRCLE:
				shape = new Circle();
				break;
			case SQUARE:
				shape = new Square();
				break;
		}
		
		
		return shape;
		
		
	}

}
