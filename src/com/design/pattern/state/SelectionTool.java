package com.design.pattern.state;

public class SelectionTool implements Tool{

	@Override
	public void mouseDown() {
		// TODO Auto-generated method stub
		System.out.println("Selection Icon");
	}

	@Override
	public void mouseUp() {
		// TODO Auto-generated method stub
		System.out.println("Draw a dashed rectangle");
	}

}
