package CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory;

import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.Chair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.Table;

public interface FurnitureFactory {
	
	public Chair makeChair();
	
	public Table makeTable();
	
	public Sofa makeSofa();
}
