package BuilderPattern.House;

public class Builder {
	
	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = new IglooHouseBuilder();
		
		CivilEngineer engineer = new CivilEngineer(houseBuilder);
		
		engineer.constructHouse();
		engineer.getHouse();
		
		houseBuilder = new TipiHouseBuilder();
		
		engineer.setHoueseBuilder(houseBuilder);
		engineer.constructHouse();
		engineer.getHouse();
		
	}

}
