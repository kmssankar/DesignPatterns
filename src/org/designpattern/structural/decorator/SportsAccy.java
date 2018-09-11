package org.designpattern.structural.decorator;

public class SportsAccy extends CarAccyAdder {

	private Car car;
	
	public SportsAccy(Car car)
	{
		this.car = car;
	}
	
	public String getDescription() {
		return car.getDescription() + " SportsAccy(220)  ";
	}
	
	@Override
	public int getPrice() {
		return this.car.getPrice()+220;
	}

}
