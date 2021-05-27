package StructuralDesignPattern.DecoratorPattern.Notification;

public class SMSNotifierDecorator extends NotifierDecorator{
	public SMSNotifierDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendSMS(message);
	}
	
	public void sendSMS(String message) {
		System.out.println( message + " Notification Sent via SMS!!");
	}
}
