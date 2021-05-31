package BehaviouralDesignPattern.ChainOfResponsibility.Authentication;

public abstract class AuthenticationProcessor {
	
	public AuthenticationProcessor nextProcessor;

	public AuthenticationProcessor(AuthenticationProcessor processor) {
		this.nextProcessor = processor;
	}
	
	public abstract boolean isAuthorized(AuthenticationProvider provider);
}
