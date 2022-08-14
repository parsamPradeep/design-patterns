package com.design.pattern.bridge;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl{

	@Override
	public void setChanel() {
		System.out.println("Sony set chanel");
	}

	@Override
	public void turnOn() {
		System.out.println("Sony Tv turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Sony Tv turn Off");
	}

}
