package BehaviouralDesignPattern.CommandPattern.HomeAutomation;

public class LightOnCommand implements Command {
	// reference to the light
	Light light;

	public LightOnCommand(Light light,int brightness) {
		this.light = light;
		this.light.setBrightness(brightness);
	}
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.switchON();
	}
}