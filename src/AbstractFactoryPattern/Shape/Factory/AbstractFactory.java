package AbstractFactoryPattern.Shape.Factory;

import AbstractFactoryPattern.Shape.Shapes.Shape;

public abstract class AbstractFactory {
	   public abstract Shape getShape(String shapeType) ;
}