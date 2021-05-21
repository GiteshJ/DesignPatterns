package CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Table;

public class ArtDecorTable extends Table{
	
	public void hasLegs() {
		System.out.println("ArtDecor Table has 4 legs !");
	}
	
	public void eatOn() {
		System.out.println("Eat on ArtDecor Table !!");
	}

}