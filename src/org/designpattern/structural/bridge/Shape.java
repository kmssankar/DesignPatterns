package org.designpattern.structural.bridge;

public class Shape extends Draw {

	private int x,y,radius;
	
	Shape(DrawAPI drawApi ,int x ,int y,int radius) {
		super(drawApi);
		this.x=x;
		this.y =y;
		this.radius = radius;
	}
	@Override
	protected void draw() {
		drawApi.draw(radius, x, y);
	}
}
