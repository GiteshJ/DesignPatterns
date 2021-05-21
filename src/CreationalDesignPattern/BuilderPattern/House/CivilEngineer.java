package CreationalDesignPattern.BuilderPattern.House;

public class CivilEngineer {
	
	private HouseBuilder houseBuilder;
	
	public CivilEngineer() {}
	
	public CivilEngineer(HouseBuilder houseBuilder) {	
		this.houseBuilder = houseBuilder;	
	}
	
	public void setHoueseBuilder(HouseBuilder houseBuilder) {	
		this.houseBuilder = houseBuilder;	
	}
	
	public void constructHouse() {
		
		houseBuilder.buildBasement();
		houseBuilder.buildStructure();
		houseBuilder.bulidRoof();
		houseBuilder.buildInterior();

	}
	public House getHouse() {
		return houseBuilder.getHouse();
	}
	

}
