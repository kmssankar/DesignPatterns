package org.designpattern.structural.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		
		System.out.println("-- FABIA - Diesel --");
		Car SkodaFabia = new DieselCar();
		SkodaFabia = new InfotainmentAccy(SkodaFabia);
		SkodaFabia = new PerformanceAccy(SkodaFabia);	
		System.out.println(" Description : " + SkodaFabia.getDescription() + "\n " + " Price       : " + SkodaFabia.getPrice());
		
		System.out.println("-- Vento - Petrol --");
		Car Vento = new PetrolCar();
		Vento = new InfotainmentAccy(Vento);
		Vento = new PerformanceAccy(Vento);	
		System.out.println(" Description : " + Vento.getDescription() + "\n " + " Price       : " + Vento.getPrice());
	}

}

/*
OUTPUT
-- FABIA - Diesel --
 Description :  Diesel Car (17000)  Infotainment(650)   PerformanceAccy(120)  
  Price       : 17770
-- Vento - Petrol --
 Description :  Petrol Car (15500)  Infotainment(650)   PerformanceAccy(120)  
  Price       : 16270
*/