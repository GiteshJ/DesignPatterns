package CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory;

import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.ArtDecorChair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair.Chair;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.ArtDecorSofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.ArtDecorTable;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table.Table;

public class ArtDecorFurnitureFactory implements FurnitureFactory {
	
	public Chair makeChair() {
		Chair chair = new ArtDecorChair();
		return chair;
	}
	
	public Table makeTable() {
		Table table = new ArtDecorTable();
		return table;
	}
	
	public Sofa makeSofa() {
		Sofa sofa = new ArtDecorSofa();
		return sofa;
	}
	
}
