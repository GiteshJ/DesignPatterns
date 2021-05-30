package StructuralDesignPattern.ProxyPattern.InternetDemo;

public class Client {
	
	Internet internet ;
	public Client(Internet internet) {
	
		this.internet = internet;
	}
	
	public void connectTo(String serverHost) {
		try {
			internet.connectTo(serverHost);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
