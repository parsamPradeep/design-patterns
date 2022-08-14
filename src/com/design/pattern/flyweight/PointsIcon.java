package com.design.pattern.flyweight;

public class PointsIcon {
	private final Types type;	// 4bytes
	private final byte[] icons;// 20KB
	
	public Types getType() {
		return type;
	}
	
	public PointsIcon(Types type, byte[] icons) {
		super();
		this.type = type;
		this.icons = icons;
	}
	
}
