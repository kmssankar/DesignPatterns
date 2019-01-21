package org.designpattern.behavioral.state;

public class ServerDownState implements State {

	@Override
	public void doState() {
		System.out.println("Server Down state");

	}
}
