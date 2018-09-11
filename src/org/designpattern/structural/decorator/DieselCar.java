package org.designpattern.structural.decorator;

public class DieselCar implements Car {

	@Override
	public String getDescription() {
		
		return " Diesel Car (17000) ";
	}

	@Override
	public int getPrice() {
		return 17000;
	}

}
