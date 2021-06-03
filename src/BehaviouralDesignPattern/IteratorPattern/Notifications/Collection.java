package BehaviouralDesignPattern.IteratorPattern.Notifications;

public interface Collection {
	
	Iterator iterator();
	
	public boolean add(String message);

}
