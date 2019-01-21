package org.designpattern.behavioral.state;

public class ServerContext implements State {

	State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	@Override
	public void doState() {
		this.state.doState();

	}

}
