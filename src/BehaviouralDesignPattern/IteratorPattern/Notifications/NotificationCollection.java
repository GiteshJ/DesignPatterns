package BehaviouralDesignPattern.IteratorPattern.Notifications;

public class NotificationCollection implements Collection{
	
	public static final int MAX_ITEMS = 10;
	
	Notification[] notificationList;
	private int numOfItems = 0;
	NotificationCollection(){
		notificationList = new Notification[MAX_ITEMS];
	}
	
	public boolean add(String message) {
		if(numOfItems<MAX_ITEMS) {
			Notification notification =  new Notification(message);
			notificationList[numOfItems] = notification;
			numOfItems++;
			return true;
		}
		else {
			System.out.println("Error");
			return false;
		}
	}
	
	public Iterator iterator() {
		return new NotificationIterator(notificationList);
	}

}
