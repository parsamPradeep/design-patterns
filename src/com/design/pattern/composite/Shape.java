package com.design.pattern.composite;

public class Shape implements Component{

	@Override
	public void resize() {
		System.out.println("Resizing Component");	
	}

	@Override
	public void move() {
		System.out.println("Moving Component");	
	}

}
