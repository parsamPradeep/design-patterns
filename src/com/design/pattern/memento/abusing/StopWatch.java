package com.design.pattern.memento.abusing;

public class StopWatch {
	private State currentState = new StopState(this);
	
	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public void click() {
		currentState.click();
	}

}
