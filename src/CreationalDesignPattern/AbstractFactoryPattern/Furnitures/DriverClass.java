package CreationalDesignPattern.AbstractFactoryPattern.Furnitures;

import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory.ArtDecorFurnitureFactory;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory.ModernFurnitureFactory;
import CreationalDesignPattern.AbstractFactoryPattern.Furnitures.FurnitureFactory.VictorianFurnitureFactory;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling Modern Furniture Factory");
		FurnitureClient.makeFurniture(new ModernFurnitureFactory());
		System.out.println();
		
		System.out.println("Calling Victorian Furniture Factory");
		FurnitureClient.makeFurniture(new VictorianFurnitureFactory());
		System.out.println();
		
		System.out.println("Calling ArtDecor Furniture Factory");
		FurnitureClient.makeFurniture(new ArtDecorFurnitureFactory());
		System.out.println();

	}
}
