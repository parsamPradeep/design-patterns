package com.design.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
	private PointIconFactory iconFactory;
	
	
	public PointService(PointIconFactory iconFactory) {
		super();
		this.iconFactory = iconFactory;
	}


	public List<Points> getPoints(){
		List<Points> points = new ArrayList<>();
		var point = new Points(1, 2, iconFactory.getPointIcon(Types.CAFE));
		points.add(point);
		return points;	
	}
}
