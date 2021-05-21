package CreationalDesignPattern.AbstractFactoryPattern.Shape;

import CreationalDesignPattern.AbstractFactoryPattern.Shape.Factory.AbstractFactory;
import CreationalDesignPattern.AbstractFactoryPattern.Shape.Factory.RoundedShapeFactory;
import CreationalDesignPattern.AbstractFactoryPattern.Shape.Factory.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundedShapeFactory();         
      }else{
         return new ShapeFactory();
      }
   }
}