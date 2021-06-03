package BehaviouralDesignPattern.IteratorPattern.Notifications;

public class NotificationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection collection = new NotificationCollection();
		collection.add("Notification 1");
		collection.add("Notification 2");
		collection.add("Notification 3");
		NotificationBar bar = new NotificationBar(collection);
		bar.printNotification();
	}

}
