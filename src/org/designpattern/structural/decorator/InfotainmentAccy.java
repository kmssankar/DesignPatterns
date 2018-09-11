package org.designpattern.structural.decorator;

public class InfotainmentAccy extends CarAccyAdder {

	private Car car;
	
	public InfotainmentAccy(Car car)
	{
		this.car = car;
	}
	
	public String getDescription() {
		return car.getDescription() + " Infotainment(650)  ";
	}
	
	@Override
	public int getPrice() {
		return this.car.getPrice()+650;
	}

}
