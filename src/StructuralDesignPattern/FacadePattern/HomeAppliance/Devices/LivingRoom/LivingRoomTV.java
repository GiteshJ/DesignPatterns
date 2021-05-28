package StructuralDesignPattern.FacadePattern.HomeAppliance.Devices.LivingRoom;

import StructuralDesignPattern.FacadePattern.HomeAppliance.Devices.TV;

public class LivingRoomTV extends TV {

	protected String source;

	public LivingRoomTV() {
		super("LivingRoomTV");
	}

	public void setSource(String source) {
		this.source = source;
		System.out.printf("Setting Source of '%s' to '%s'.\n", name, source);
	}

	public String source() {
		return source;
	}
}