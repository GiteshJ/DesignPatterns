package AbstractFactoryPattern.Furnitures.FurnitureFactory;

import AbstractFactoryPattern.Furnitures.Chair.Chair;
import AbstractFactoryPattern.Furnitures.Chair.ModernChair;
import AbstractFactoryPattern.Furnitures.Sofa.ModernSofa;
import AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import AbstractFactoryPattern.Furnitures.Table.ModernTable;
import AbstractFactoryPattern.Furnitures.Table.Table;

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
