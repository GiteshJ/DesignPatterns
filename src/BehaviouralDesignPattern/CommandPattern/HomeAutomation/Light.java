package BehaviouralDesignPattern.CommandPattern.HomeAutomation;

public class Light {

	public boolean on;
	public int brightness  =  10;
	
	public Light() {}
	
	
	
	public void switchON() {
		System.out.println("Light Switched ON with Brightness : " + this.brightness);
		on = true;
	}

	public void switchOFF() {
		System.out.println("Light Switched OFF ");
		on = true;
	}

	public int getBrightness() {
		
		return brightness;
	}

	public void setBrightness(int brightness) {
		
		this.brightness = brightness;
		System.out.println("Brightness set to : " + this.brightness);
	}

}
