package com.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
	private Map <Types, PointsIcon> icons=new HashMap<>();

	public PointsIcon getPointIcon(Types type) {
		if(!icons.containsKey(type)) {
			var icon = new PointsIcon(type, null);
			icons.put(type, icon);
		}
		return icons.get(type);
	}
}
