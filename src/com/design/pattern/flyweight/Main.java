package com.design.pattern.flyweight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointService servce=new PointService(new PointIconFactory());
		for(var points:servce.getPoints())
			points.draw();

	}

}
