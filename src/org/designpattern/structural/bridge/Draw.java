package org.designpattern.structural.bridge;

public abstract class Draw {

	protected DrawAPI drawApi;

	Draw(DrawAPI drawApi) {
		this.drawApi = drawApi;
	}

	protected abstract void draw();
}
