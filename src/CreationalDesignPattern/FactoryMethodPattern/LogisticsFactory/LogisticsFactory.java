package CreationalDesignPattern.FactoryMethodPattern.LogisticsFactory;

public class LogisticsFactory {

	public static Logistics getLogistics(LogisticsType type) {
		
		Logistics logistic = null;
		
		switch(type) {
			case AIR:
				logistic = new AirLogistics();
				break;
			case SEA:
				logistic = new SeaLogistics();
				break;
			case ROAD:
				logistic = new RoadLogistics();
				break;
		}
		return logistic;
		
	}
}
