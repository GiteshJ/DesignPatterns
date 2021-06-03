package BehaviouralDesignPattern.IteratorPattern.Notifications;

public class Notification {
	
	public Notification(String notification) {
		super();
		this.notification = notification;
	}

	String notification;

	public String getNotification() {
		return notification;
	}

	@Override
	public String toString() {
		return "Notification [notification=" + notification + "]";
	}
	

}
