package BehaviouralDesignPattern.MediatorPattern.ATCSystem;
/*
 * Mediator
 */
public class ATC {
	private boolean runwayFull = false;
	private int number;

	public synchronized void requestLanding(int num) {
		// no room for another flight
		while (runwayFull == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Flight Number : " + num + " can Land Now");
		
		runwayFull = true;
		number = num;
		notifyAll();
	}

	public synchronized int landFlight() {
		// no flight to Land
		while (runwayFull == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Flight Number : " + number + " is On Runway Now");
		runwayFull = false;
		notifyAll();
		return number;
	}
}
