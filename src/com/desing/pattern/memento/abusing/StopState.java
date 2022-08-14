package com.desing.pattern.memento.abusing;

public class StopState implements State{
	private StopWatch stopWatch;
	
	public StopState(StopWatch stopWatch) {
		this.stopWatch=stopWatch;
	}
	@Override
	public void click() {
		stopWatch.setCurrentState(new RunningState(stopWatch));
		System.out.println("Runing");
	}

}
