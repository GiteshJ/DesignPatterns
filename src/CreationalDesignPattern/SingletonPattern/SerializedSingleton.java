package CreationalDesignPattern.SingletonPattern;

import java.io.Serializable;


public class SerializedSingleton implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6671879075640973217L;

	private SerializedSingleton() {}
	
	private static class SingletonHelper{
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	/* key function  - it allows the deserialized object to be of the same instance as the serialized one - 
	* to check compare has code in test function by keeping and removing the below function
	*/
	public Object readResolve() {
		return getInstance();
	}
	
}
