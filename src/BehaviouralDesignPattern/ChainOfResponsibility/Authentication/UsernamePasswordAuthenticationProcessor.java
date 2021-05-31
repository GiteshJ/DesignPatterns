package BehaviouralDesignPattern.ChainOfResponsibility.Authentication;

public class UsernamePasswordAuthenticationProcessor extends AuthenticationProcessor{
	public UsernamePasswordAuthenticationProcessor(AuthenticationProcessor processor) {
		super(processor);
	}
	
	
	public boolean isAuthorized(AuthenticationProvider provider) {
		if(provider instanceof UsernamePasswordAuthenticationProvider) {
			return true;
		}
		else if(nextProcessor !=null) {
			return nextProcessor.isAuthorized(provider);
		}
		else return false;
	}
}
