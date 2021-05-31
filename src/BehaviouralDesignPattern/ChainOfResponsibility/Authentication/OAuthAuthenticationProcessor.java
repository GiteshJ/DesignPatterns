package BehaviouralDesignPattern.ChainOfResponsibility.Authentication;

public class OAuthAuthenticationProcessor extends AuthenticationProcessor{
	
	public OAuthAuthenticationProcessor(AuthenticationProcessor processor) {
		super(processor);
	}
	
	
	public boolean isAuthorized(AuthenticationProvider provider) {
		if(provider instanceof OAuthAuthenticationProvider) {
			return true;
		}
		else if(nextProcessor !=null) {
			return nextProcessor.isAuthorized(provider);
		}
		else return false;
	}

}
