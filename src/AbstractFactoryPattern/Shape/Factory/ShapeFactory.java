package AbstractFactoryPattern.Shape.Factory;

import AbstractFactoryPattern.Shape.Shapes.Rectangle;
import AbstractFactoryPattern.Shape.Shapes.Shape;
import AbstractFactoryPattern.Shape.Shapes.Square;

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