package StructuralDesignPattern.AdapterPattern.Bird;

public class Sparrow implements Bird{
	
	public void fly() {
		System.out.println("Sparrow is Flying");
	}
	
	public void makeSound() {
		System.out.println("Chirp Chirp");
	}
	
}
