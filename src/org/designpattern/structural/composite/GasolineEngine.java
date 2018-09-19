package org.designpattern.structural.composite;

public class GasolineEngine implements Engine {

	@Override
	public void buildEngine(int  cc) {
		System.out.println(" Building Gasoline Engine with CC "+cc);

	}

}
