package StructuralDesignPattern.ProxyPattern.InternetDemo;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	
	static List<String> bannedSites = new ArrayList<>();
	Internet realInternet = new RealInternet();
	static {
		bannedSites.add("abc.xyz");
		bannedSites.add("abc.com");
		bannedSites.add("abc.in");
		bannedSites.add("abc.cl");
	}
	
	public void connectTo(String serverHost) throws Exception {
		if(bannedSites.contains(serverHost))
			throw new Exception("Access Denied!!");
		else realInternet.connectTo(serverHost);
	}

}
