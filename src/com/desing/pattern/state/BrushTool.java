package com.desing.pattern.state;

public class BrushTool implements Tool{

	@Override
	public void mouseDown() {
		// TODO Auto-generated method stub
		System.out.println("Brush Icon");
	}

	@Override
	public void mouseUp() {
		// TODO Auto-generated method stub
		System.out.println("Draw a line");
	}

}
