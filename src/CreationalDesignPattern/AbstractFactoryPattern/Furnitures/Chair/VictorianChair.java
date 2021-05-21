package CreationalDesignPattern.AbstractFactoryPattern.Furnitures.Chair;

public class VictorianChair extends Chair{

	public void hasLegs() {
		System.out.println("Victorian Chair has 4 legs !");
	}
	
	public void sitOn() {
		System.out.println("Sit On Victorian Chair !!");
	}

}