package com.design.pattern.state;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var canvas=new Canvas();
		canvas.setCurrentTool(new SelectionTool());
		canvas.mouseDown();
		canvas.mouseUp();
		
		canvas.setCurrentTool(new BrushTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}

}
