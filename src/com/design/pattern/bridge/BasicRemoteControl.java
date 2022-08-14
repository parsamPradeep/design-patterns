package com.design.pattern.bridge;

public class BasicRemoteControl {
	Device device;
	public BasicRemoteControl(Device device) {
		super();
		this.device = device;
	}
	public void turnOn() {
		device.turnOn();
	}
	public void turnOff() {
		device.turnOff();
	}
}

/*
 * public abstract class BasicRemoteControl { abstract void turnOn(); abstract
 * void turnOff(); }
 */