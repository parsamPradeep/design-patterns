package com.design.pattern.bridge;

public class SonyRemoteControl extends BasicRemoteControl{

	@Override
	public void turnOn() {
	System.out.println("Sony Tv turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Sony Tv turn Off");
	}

}	
