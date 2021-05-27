package StructuralDesignPattern.DecoratorPattern.Notification;

public class EmailNotifier implements Notifier{

	
	public void send(String message) {
		System.out.println( message + " Notification Sent via Email!!");
	}
}
