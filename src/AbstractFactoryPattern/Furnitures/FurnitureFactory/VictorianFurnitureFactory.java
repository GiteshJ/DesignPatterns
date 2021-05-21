package AbstractFactoryPattern.Furnitures.FurnitureFactory;

import AbstractFactoryPattern.Furnitures.Chair.Chair;
import AbstractFactoryPattern.Furnitures.Chair.VictorianChair;
import AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import AbstractFactoryPattern.Furnitures.Sofa.VictorianSofa;
import AbstractFactoryPattern.Furnitures.Table.Table;
import AbstractFactoryPattern.Furnitures.Table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
	
	public Chair makeChair() {
		Chair chair = new VictorianChair();
		return chair;
	}
	
	public Table makeTable() {
		Table table = new VictorianTable();
		return table;
	}
	
	public Sofa makeSofa() {
		Sofa sofa = new VictorianSofa();
		return sofa;
	}
	
}
