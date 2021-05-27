package StructuralDesignPattern.DecoratorPattern.Notification;

public class SlackNotiferDecorator extends NotifierDecorator{
	public SlackNotiferDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendSlack(message);
	}
	
	public void sendSlack(String message) {
		System.out.println( message + " Notification Sent via Slack!!");
	}
}
