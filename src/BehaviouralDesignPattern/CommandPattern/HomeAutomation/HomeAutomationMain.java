package BehaviouralDesignPattern.CommandPattern.HomeAutomation;

public class HomeAutomationMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		
		
		
		// switch on
		control.setCommand(lightsOn);
		control.pressButton();

		// switch off
		control.setCommand(lightsOff);
		control.pressButton();
		
		// note how we can pass receivers and args together to command
		Command ligthOnWithBrightness = new LightOnCommand(light,5);
		// switch on with specified brightness
		control.setCommand(ligthOnWithBrightness);
		control.pressButton();
	}
}
