package StructuralDesignPattern.ProxyPattern.InternetDemo;

public class InternetMain {
	
	public static void main(String[] args) {
		
		Client cl = new Client(new ProxyInternet());
		
		cl.connectTo("abc.com");
		cl.connectTo("asd.qwe");
		
	}

}
