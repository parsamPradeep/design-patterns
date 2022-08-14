package com.design.pattern.flyweight;

public class Points {
	private int x;		// 4bytes
	private int y;		// 4bytes
	PointsIcon pointIcon;
	public Points(int x, int y, PointsIcon pointIcon) {
		super();
		this.x = x;
		this.y = y;
		this.pointIcon = pointIcon;
	}
	public void draw() {
		System.out.printf("%s at (%d, %d)", pointIcon.getType(), x, y);
	}
}
