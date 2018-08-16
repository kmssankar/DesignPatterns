package org.designpattern.creational.Prototype;

public class PrototypeMain {

	public static void main(String[] args) {
	
		VehicleCache.AddCache();
		VehicleCache.getvehicle("car").showDetails();
		VehicleCache.getvehicle("truck").showDetails();
		VehicleCache.getvehicle("tractor").showDetails();
	}

}

/*OUTPUT
This is Car Manufacturer : VOLKSWAGEN
This is Truck Manufacturer : TOYOTA
This is Tractor Manufacturer : VOLVO*/