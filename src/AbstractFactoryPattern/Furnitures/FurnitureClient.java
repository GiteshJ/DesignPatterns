package AbstractFactoryPattern.Furnitures;

import AbstractFactoryPattern.Furnitures.Chair.Chair;
import AbstractFactoryPattern.Furnitures.FurnitureFactory.FurnitureFactory;
import AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import AbstractFactoryPattern.Furnitures.Table.Table;

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
