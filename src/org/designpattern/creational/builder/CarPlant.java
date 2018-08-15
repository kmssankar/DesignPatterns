package org.designpattern.creational.builder;

public class CarPlant {

	private Carbuilder carbuilder;

	CarPlant(Carbuilder carbuilder) {
		this.carbuilder = carbuilder;
	}

	public void constructCar() {
		this.carbuilder.buildEngine();
		this.carbuilder.buildColor();
		this.carbuilder.buildExterior();
		this.carbuilder.buildVarient();
	}

	public Car getCar() {
		
		return this.carbuilder.getCar();
	}
}
