package org.designpattern.structural.decorator;

public class PetrolCar implements Car {

	@Override
	public String getDescription() {
		
		return " Petrol Car (15500) ";
	}

	@Override
	public int getPrice() {
		return 15500;
	}

}
