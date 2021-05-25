package StructuralDesignPattern.AdapterPattern.Bird;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToyDuck t1 = new PlasticToyDuck();
		t1.squeak();
		
		ToyDuck t2 = new BirdAdapter(new Sparrow());
		t2.squeak();
	}

}
