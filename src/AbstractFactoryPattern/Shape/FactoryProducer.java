package AbstractFactoryPattern.Shape;

import AbstractFactoryPattern.Shape.Factory.AbstractFactory;
import AbstractFactoryPattern.Shape.Factory.RoundedShapeFactory;
import AbstractFactoryPattern.Shape.Factory.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundedShapeFactory();         
      }else{
         return new ShapeFactory();
      }
   }
}