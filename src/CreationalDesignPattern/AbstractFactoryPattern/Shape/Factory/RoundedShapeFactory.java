package CreationalDesignPattern.AbstractFactoryPattern.Shape.Factory;

import CreationalDesignPattern.AbstractFactoryPattern.Shape.Shapes.RoundedRectangle;
import CreationalDesignPattern.AbstractFactoryPattern.Shape.Shapes.RoundedSquare;
import CreationalDesignPattern.AbstractFactoryPattern.Shape.Shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory {
	   @Override
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RoundedRectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	 
	      return null;
	   }
	}