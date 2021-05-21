package CreationalDesignPattern.FactoryMethodPattern.LogisticsFactory;

public class AirLogistics implements Logistics{
	
	public void shipProduct() {
		System.out.println(" Ship Product through Cargo Plane");
	}
}
