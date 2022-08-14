package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
	private List<Component> shapes=new ArrayList<Component>();

	public void add(Component component) {
		shapes.add(component);
	}
	@Override
	public void resize() {
		for(int i=0;i<shapes.size();i++)
			shapes.get(i).resize();
	}

	@Override
	public void move() {
		for(int i=0;i<shapes.size();i++)
			shapes.get(i).move();
	}
	
}
