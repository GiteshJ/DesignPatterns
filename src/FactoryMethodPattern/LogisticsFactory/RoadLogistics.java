package FactoryMethodPattern.LogisticsFactory;

public class RoadLogistics implements Logistics{
	
	public void shipProduct() {
		System.out.println(" Ship Product through Cargo Trucks");
	}
}
