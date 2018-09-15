package org.designpattern.structural.bridge;

/*Bridge Pattern

A Bridge Pattern says that just "decouple the functional abstraction 
from the implementation so that the two can vary independently".

The Bridge Pattern is also known as Handle or Body.

Advantage of Bridge Pattern
It enables the separation of implementation from the interface.
It improves the extensibility.
It allows the hiding of implementation details from the client.

Usage of Bridge Pattern
When you don't want a permanent binding between the functional abstraction and its implementation.
When both the functional abstraction and its implementation need to extended using sub-classes.
It is mostly used in those places where changes are made in the implementation does not affect the clients.*/

public class BridgeMain {

	public static void main(String[] args) {
		
		Shape Greencircle = new Shape(new GreenCircle(), 3, 12, 12);
		Shape Redcircle = new Shape(new RedCircle(), 3, 12, 12);
		
		Greencircle.draw();
		Redcircle.draw();
	}

}

/*OUTPUT
Dawing Green circle  Radius  12 X and Y : 3 : 12
Dawing Red circle  Radius 12 X and Y : 3 : 12
*/