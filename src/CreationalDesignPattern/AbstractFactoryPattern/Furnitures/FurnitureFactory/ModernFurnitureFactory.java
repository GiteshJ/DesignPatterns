package CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory;

import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.Chair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.ModernChair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.ModernSofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.ModernTable;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
	
	public Chair makeChair() {
		Chair chair = new ModernChair();
		return chair;
	}
	
	public Table makeTable() {
		Table table = new ModernTable();
		return table;
	}
	
	public Sofa makeSofa() {
		Sofa sofa = new ModernSofa();
		return sofa;
	}
	
}
