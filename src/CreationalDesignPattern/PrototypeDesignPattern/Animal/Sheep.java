package CreationalDesignPattern.PrototypeDesignPattern.Animal;

public class Sheep implements Animal{
	
	public Sheep() {
		System.out.println("Sheep is made!");
	}
	public Animal makeCopy() {
		
		System.out.println("Sheep is being  made!");
		
		Sheep sheep = null;
		
		try {
			
			sheep = (Sheep) super.clone();
			
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Sheep Dead!");
		}
		
		return sheep;
		
	}
}
