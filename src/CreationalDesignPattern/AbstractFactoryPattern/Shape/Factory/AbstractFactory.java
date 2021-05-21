package CreationalDesignPattern.AbstractFactoryPattern.Shape.Factory;

import CreationalDesignPattern.AbstractFactoryPattern.Shape.Shapes.Shape;

public abstract class AbstractFactory {
	   public abstract Shape getShape(String shapeType) ;
}