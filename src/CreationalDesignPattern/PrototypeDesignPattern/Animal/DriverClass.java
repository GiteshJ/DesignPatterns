package CreationalDesignPattern.PrototypeDesignPattern.Animal;

public class DriverClass {

	public static void main(String[] args){
			
			
		CloneFactory animalMaker = new CloneFactory();
		
		
		Sheep sheepA = new Sheep();
		
		Sheep sheepB = (Sheep) animalMaker.getClone(sheepA);
		
		
		System.out.println(sheepA);
		
		System.out.println(sheepB);
		
		System.out.println("sheepA HashCode: " + System.identityHashCode(sheepA));
		
		System.out.println("sheepB HashCode: " + System.identityHashCode(sheepB));
		
		Dog DogA = new Dog();
		
		Dog DogB = (Dog) animalMaker.getClone(DogA);
		
		
		System.out.println(DogA);
		
		System.out.println(DogB);
		
		System.out.println("sheepA HashCode: " + System.identityHashCode(DogA));
		
		System.out.println("sheepB HashCode: " + System.identityHashCode(DogB));
	}

}
