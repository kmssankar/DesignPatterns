package org.designpattern.structural.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void draw(int radius, int x, int y) {

		System.out.println("Dawing Green circle  Radius  " + radius + " X and Y : " + x + " : " + y);

	}
}
