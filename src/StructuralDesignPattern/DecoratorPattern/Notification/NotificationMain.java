package StructuralDesignPattern.DecoratorPattern.Notification;

public class NotificationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notifier fireNotification = new SlackNotiferDecorator(new SMSNotifierDecorator(new FBNotifierDecorator(new EmailNotifier())));
		fireNotification.send("FIRE");
		
		Notifier simpleNotification = new EmailNotifier();
		simpleNotification.send("SIMPLE");
		
		Notifier corporateNotification = new SlackNotiferDecorator(new EmailNotifier());
		corporateNotification.send("CORPORATIVA");
		
	}

}
