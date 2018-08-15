package org.designpattern.creational.builder;

/* Builder pattern
 * 
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” 
It is used to construct a complex object step by step and the final step will return the object. 
The process of constructing an object should be generic so that it can be used to create
different representations of the same object.*/

public class CarBuilderMain {

	public static void main(String[] args) {
		VWbuilder VWBuilderinst = new VWbuilder();
		CarPlant  VWPlant = new CarPlant(VWBuilderinst);
		VWPlant.constructCar();		
		System.out.println(VWPlant.getCar());
		
		Skodabuilder SkodaBuilderinst = new Skodabuilder();
		VWPlant = new CarPlant(SkodaBuilderinst);
		
		VWPlant.constructCar();		
		System.out.println(VWPlant.getCar());
	}
}

/*
OUTPUT:
Car [engine=VW 1.9 TDI 185 BHP, exterior=Classic American Sedan, color=All Metallic Dark Colors, varient=Trendline - comfortline - highline]
Car [engine=Skoda MK3 1.9 TDI 170 BHP, exterior=Classic European Sedan, color=All Metallic Light Colors, varient=Ambition - Style - StylePlus]*/
