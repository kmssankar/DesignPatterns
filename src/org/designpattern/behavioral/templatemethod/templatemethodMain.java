package org.designpattern.behavioral.templatemethod;

public class templatemethodMain {

	public static void main(String[] args) {
		VehicleService carService = new CarService();
		VehicleService bikeService  = new BikeService();
		
		carService.doService();
		bikeService.doService();

	}

}

/*OUTPUT
   Bill summary : 
	   Electricals Checkup(320) ; + engine Checkup(400) ; + oilChange(3700) ; + washservice + 3M Wax (650) ;
	 Total Amount to be Paid -> 5070
	Bill summary : 
	   Electricals Checkup(120) ; + engine Checkup(100) ; + oilChange(350) ; + washservice(150) ;
	 Total Amount to be Paid -> 720*/