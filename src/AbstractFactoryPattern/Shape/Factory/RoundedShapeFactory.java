package AbstractFactoryPattern.Shape.Factory;

import AbstractFactoryPattern.Shape.Shapes.RoundedRectangle;
import AbstractFactoryPattern.Shape.Shapes.RoundedSquare;
import AbstractFactoryPattern.Shape.Shapes.Shape;

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