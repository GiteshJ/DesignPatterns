package CreationalDesignPattern.PrototypeDesignPattern.Animal;

public class Dog implements Animal{
	
	public Dog() {
		System.out.println("Dog is made!");
	}
	public Animal makeCopy() {
		
		System.out.println("Dog is being  made!");
		
		Dog sheep = null;
		
		try {
			
			sheep = (Dog) super.clone();
			
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Dog Dead!");
		}
		
		return sheep;
		
	}

}
