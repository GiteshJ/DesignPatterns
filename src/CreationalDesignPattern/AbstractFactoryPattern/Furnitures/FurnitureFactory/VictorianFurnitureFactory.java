package CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory;

import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.Chair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.VictorianChair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.VictorianSofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.Table;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.VictorianTable;

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
