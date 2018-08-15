package org.designpattern.creational.builder;

public interface Carbuilder {

	public void buildEngine();

	public void buildExterior();

	public void buildColor();

	public void buildVarient();
	
	public Car getCar();
}

class VWbuilder implements Carbuilder {

	private Car car = new Car();

	@Override
	public void buildEngine() {
		car.setEngine("VW 1.9 TDI 185 BHP");

	}

	@Override
	public void buildExterior() {
		car.setExterior("Classic American Sedan");

	}

	@Override
	public void buildColor() {
		car.setColor("All Metallic Dark Colors");

	}

	@Override
	public void buildVarient() {
		car.setVarient("Trendline - comfortline - highline");

	}

	public Car getCar() {
		return this.car;
	}
}

class Skodabuilder implements Carbuilder {

	private Car car = new Car();

	@Override
	public void buildEngine() {
		car.setEngine("Skoda MK3 1.9 TDI 170 BHP");

	}

	@Override
	public void buildExterior() {
		car.setExterior("Classic European Sedan");

	}

	@Override
	public void buildColor() {
		car.setColor("All Metallic Light Colors");

	}

	@Override
	public void buildVarient() {
		car.setVarient("Ambition - Style - StylePlus");

	}

	public Car getCar() {
		return this.car;
	}
}