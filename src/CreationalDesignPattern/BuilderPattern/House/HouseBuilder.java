package CreationalDesignPattern.BuilderPattern.House;

public interface HouseBuilder {

	
	public void buildBasement();
	  
    public void buildStructure();
  
    public void bulidRoof();
  
    public void buildInterior();
  
    public House getHouse();
    
    public default void showHouse(House house) {
    	System.out.println(house.toString());
    }
}
