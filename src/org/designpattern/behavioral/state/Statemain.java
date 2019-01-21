package org.designpattern.behavioral.state;

public class Statemain {

	public static void main(String[] args) {
		
		ServerContext context = new ServerContext();
		
		State downState = new ServerDownState();
		State upState = new ServerUPState();
		
		context.setState(downState);
		context.doState();
		
		context.setState(upState);
		context.doState();
	}
}

/*OUTPUT:
Server Down state
Server UP state*/
