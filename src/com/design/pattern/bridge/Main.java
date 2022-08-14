package com.design.pattern.bridge;

public class Main {

	public static void main(String[] args) {
		var remoteControl = new AdvancedRemoteControl(new SonyTV());
		remoteControl.turnOn();
		remoteControl.setChnel();
		remoteControl.turnOff();
	}

}
