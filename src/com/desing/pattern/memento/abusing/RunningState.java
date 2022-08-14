package com.desing.pattern.memento.abusing;

public class RunningState implements State {
	private StopWatch stopWatch;
	
	public RunningState(StopWatch stopWatch) {
		this.stopWatch=stopWatch;
	}

	@Override
	public void click() {
		stopWatch.setCurrentState(new StopState(stopWatch));
		System.out.println("Stopped");
	}

}
