package org.designpattern.structural.bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void draw(int radius, int x, int y) {

		System.out.println("Dawing Red circle  Radius " + radius +  " X and Y : " + x + " : " + y);

	}
}
