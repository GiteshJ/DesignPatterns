package CreationalDesignPattern.PrototypeDesignPattern.Animal;

public interface Animal extends Cloneable{

	
	abstract Animal makeCopy();
}
