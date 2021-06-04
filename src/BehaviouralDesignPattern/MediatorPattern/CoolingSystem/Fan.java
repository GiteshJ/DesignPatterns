package BehaviouralDesignPattern.MediatorPattern.CoolingSystem;

public class Fan {
	
	Mediator mediator;
	
	boolean isOn = false;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
		
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void turnOn() {
		System.out.println("Fan Turned On");
		this.isOn = true;
		this.mediator.start();
	}
	
	public void turnOff() {
		System.out.println("Fan Turned Off");
		this.isOn = false;
		this.mediator.stop();
	}

}
