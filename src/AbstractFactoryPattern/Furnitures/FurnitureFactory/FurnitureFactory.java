package AbstractFactoryPattern.Furnitures.FurnitureFactory;

import AbstractFactoryPattern.Furnitures.Chair.Chair;
import AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import AbstractFactoryPattern.Furnitures.Table.Table;

public interface FurnitureFactory {
	
	public Chair makeChair();
	
	public Table makeTable();
	
	public Sofa makeSofa();
}
