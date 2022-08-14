package com.design.pattern.bridge;

public class SonyTV implements Device{

	@Override
	public void turnOn() {
		System.out.println("Sony TV turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Sony TV turnOff");
	}

	@Override
	public void setChanel() {
		System.out.println("Sony TV set chanel");
	}

}
