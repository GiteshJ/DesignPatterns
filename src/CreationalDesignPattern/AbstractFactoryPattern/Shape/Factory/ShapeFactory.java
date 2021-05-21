package CreationalDesignPattern.AbstractFactoryPattern.Shape.Factory;

import CreationalDesignPattern.AbstractFactoryPattern.Shape.Shapes.Rectangle;
import CreationalDesignPattern.AbstractFactoryPattern.Shape.Shapes.Shape;
import CreationalDesignPattern.AbstractFactoryPattern.Shape.Shapes.Square;

public class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }	 
      return null;
   }
}