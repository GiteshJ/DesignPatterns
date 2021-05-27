package StructuralDesignPattern.DecoratorPattern.Notification;

public class NotifierDecorator implements Notifier{

	
	Notifier notifier ;
	
	public NotifierDecorator(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void send(String message) {
		this.notifier.send(message);
	}
}
