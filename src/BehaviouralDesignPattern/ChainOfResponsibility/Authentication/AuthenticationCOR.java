package BehaviouralDesignPattern.ChainOfResponsibility.Authentication;

public class AuthenticationCOR {
	private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthAuthenticationProcessor(null);
        return new UsernamePasswordAuthenticationProcessor(oAuthProcessor);
    }

	public static void main(String[] args) {
		AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
		boolean success = authProcessorChain.isAuthorized(new OAuthAuthenticationProvider());
		System.out.println(success);
		success = authProcessorChain.isAuthorized(new SamlAuthenticationProvider());
		System.out.println(success);
		
	}
    
}
