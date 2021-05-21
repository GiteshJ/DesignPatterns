package FactoryMethodPattern.LogisticsFactory;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Logistics air = LogisticsFactory.getLogistics(LogisticsType.AIR);
		air.shipProduct();
		
		Logistics sea = LogisticsFactory.getLogistics(LogisticsType.SEA);
		sea.shipProduct();
		
		Logistics road = LogisticsFactory.getLogistics(LogisticsType.ROAD);
		road.shipProduct();
	}

}
