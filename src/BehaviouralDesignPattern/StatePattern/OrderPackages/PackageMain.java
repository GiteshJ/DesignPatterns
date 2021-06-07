package BehaviouralDesignPattern.StatePattern.OrderPackages;

public class PackageMain {
	 public static void main(String[] args) {

	        Package pkg = new Package();
	        pkg.printStatus();

	        pkg.nextState();
	        pkg.printStatus();

	        pkg.nextState();
	        pkg.printStatus();

	        pkg.nextState();
	        pkg.printStatus();
	    }
}
