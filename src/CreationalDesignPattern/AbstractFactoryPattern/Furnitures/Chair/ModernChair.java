package CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair;

public class ModernChair extends Chair{

	public void hasLegs() {
		System.out.println("Modern Chair has 4 legs !");
	}
	
	public void sitOn() {
		System.out.println("Sit On Modern Chair !!");
	}

}
