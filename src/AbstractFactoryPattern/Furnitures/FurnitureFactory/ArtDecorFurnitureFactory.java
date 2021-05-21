package AbstractFactoryPattern.Furnitures.FurnitureFactory;

import AbstractFactoryPattern.Furnitures.Chair.ArtDecorChair;
import AbstractFactoryPattern.Furnitures.Chair.Chair;
import AbstractFactoryPattern.Furnitures.Sofa.ArtDecorSofa;
import AbstractFactoryPattern.Furnitures.Sofa.Sofa;
import AbstractFactoryPattern.Furnitures.Table.ArtDecorTable;
import AbstractFactoryPattern.Furnitures.Table.Table;

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
