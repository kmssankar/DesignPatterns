package org.designpattern.structural.decorator;

public class PerformanceAccy extends CarAccyAdder {

	private Car car;
	
	public PerformanceAccy(Car car)
	{
		this.car = car;
	}
	
	public String getDescription() {
		return car.getDescription() +" PerformanceAccy(120)  ";
	}
	
	@Override
	public int getPrice() {
		return this.car.getPrice()+120;
	}

}
