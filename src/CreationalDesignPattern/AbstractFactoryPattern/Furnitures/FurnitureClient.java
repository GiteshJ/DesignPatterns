package CreationalDesignPattern.AbstractFactoryPattern.Furnitures;

import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.Chair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory.FurnitureFactory;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.Table;

public class FurnitureClient {
	
	
	public static void makeFurniture(FurnitureFactory furnitureFactory) {
		
		Chair chair = furnitureFactory.makeChair();
		chair.hasLegs();
		chair.sitOn();
		
		Table table = furnitureFactory.makeTable();
		table.hasLegs();
		table.eatOn();
		
		Sofa sofa = furnitureFactory.makeSofa();
		sofa.hasLegs();
		sofa.sitOn();
		
	}

}
