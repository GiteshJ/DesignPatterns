package CreationalDesignPattern.PrototypeDesignPattern.Animal;

public class CloneFactory {
	
	public  Animal getClone(Animal animal) {
		
		return animal.makeCopy();
	}

}
