package StructuralDesignPattern.FacadePattern.HomeAppliance.Devices.LivingRoom;

import StructuralDesignPattern.FacadePattern.HomeAppliance.Devices.SoundBar;
import StructuralDesignPattern.FacadePattern.HomeAppliance.Devices.TV;

public class LivingRoomSoundBar extends SoundBar {

	protected TV tv;

	public LivingRoomSoundBar(TV tv) {
		super("LivingRoomSoundBar");
		this.tv = tv;
	}

	public TV tv() {
		return tv;
	}
	
}