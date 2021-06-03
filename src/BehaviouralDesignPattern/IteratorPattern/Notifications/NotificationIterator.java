package BehaviouralDesignPattern.IteratorPattern.Notifications;

public class NotificationIterator implements Iterator{

	
	Notification[] notificationList;
	private int position = 0;
	
	public NotificationIterator(Notification[] notificationList) {
		super();
		this.notificationList = notificationList;
		
	}
	
	public boolean hasNext() {
		if(position>=notificationList.length || notificationList[position]==null) return false;
		else return true;
	}
	
	@Override
	public Notification next() {
		System.out.println(position);
		return notificationList[position++];
		
	}
}
