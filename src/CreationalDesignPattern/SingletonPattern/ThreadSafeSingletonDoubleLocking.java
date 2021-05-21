package CreationalDesignPattern.SingletonPattern;

public class ThreadSafeSingletonDoubleLocking {

	 private static ThreadSafeSingletonDoubleLocking instance;

	 private ThreadSafeSingletonDoubleLocking(){}
	 
	 public static ThreadSafeSingletonDoubleLocking getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingletonDoubleLocking();
	            }
	        }
	    }
	    return instance;
	}
}
