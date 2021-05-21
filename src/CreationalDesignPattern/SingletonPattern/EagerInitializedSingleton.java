package CreationalDesignPattern.SingletonPattern;

public class EagerInitializedSingleton {
	
	private static volatile EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
