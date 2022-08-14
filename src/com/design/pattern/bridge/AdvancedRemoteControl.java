package com.design.pattern.bridge;

public class AdvancedRemoteControl extends BasicRemoteControl {
	public AdvancedRemoteControl(Device device) {
		super(device);
	}

	public void setChnel() {
		device.setChanel();
	}

}

/*
 * public abstract class AdvancedRemoteControl extends BasicRemoteControl{
 * abstract setChnel(); }
 */