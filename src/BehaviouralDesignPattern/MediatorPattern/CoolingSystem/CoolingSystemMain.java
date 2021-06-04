package BehaviouralDesignPattern.MediatorPattern.CoolingSystem;

public class CoolingSystemMain {
	
	public static void main(String[] args) {
		
		Fan fan = new Fan();
		Button button = new Button();
		Mediator mediator = new Mediator();
		PowerSupplier powerSupplier = new PowerSupplier();
		
		mediator.setFan(fan);
		mediator.setPowerSupplier(powerSupplier);
		mediator.setButton(button);
		
		button.press();
		button.press();
		
	}

}
