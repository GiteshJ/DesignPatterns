package AbstractFactoryPattern.Furnitures.Chair;

public class ArtDecorChair extends Chair{

	public void hasLegs() {
		System.out.println("ArtDecor Chair has 4 legs !");
	}
	
	public void sitOn() {
		System.out.println("Sit On ArtDecor Chair !!");
	}

}