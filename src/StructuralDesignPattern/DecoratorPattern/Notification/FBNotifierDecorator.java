package StructuralDesignPattern.DecoratorPattern.Notification;

public class FBNotifierDecorator extends NotifierDecorator{

	public FBNotifierDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendFB(message);
	}
	
	public void sendFB(String message) {
		System.out.println( message + " Notification Sent via FB!!");
	}
}
