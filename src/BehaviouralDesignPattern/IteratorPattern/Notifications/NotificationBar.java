package BehaviouralDesignPattern.IteratorPattern.Notifications;

public class NotificationBar {

	public NotificationBar(Collection collection) {
		super();
		this.collection = collection;
	}

	Collection collection;
	
	void printNotification() {
		System.out.println("-------NOTIFICATION BAR------------");
		Iterator itr = collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
}
