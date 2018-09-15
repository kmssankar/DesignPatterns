package org.designpattern.structural.facade;

public interface Insurance {
	
	public void insuraceName();
	public void insuranceDetalis();
	public void insuranceCost();
}

 class VehicleInsurance implements Insurance
{

	@Override
	public void insuraceName() {
		System.out.println(" National Insurance - Motor Vehicles upto 35000 INR IDV");
	}

	@Override
	public void insuranceDetalis() {
		System.out.println("Covers Self and Thrid Party !!");	
	}

	@Override
	public void insuranceCost() {
		System.out.println(" Cost per year 1760 INR Including GST ..");
	}
}
 
 class HealthInsurance implements Insurance
{

	@Override
	public void insuraceName() {
		System.out.println(" Apollo Munich  - Health Insurance for Persons upto Age 33");
	}

	@Override
	public void insuranceDetalis() {
		System.out.println("Covers Self with all types of Hostpitalized Claims during term ! ");	
	}

	@Override
	public void insuranceCost() {
		System.out.println(" Cost per year 6400 INR Including GST / per person..");
	}
}
 
 class PropertyInsurance implements Insurance
 {

 	@Override
 	public void insuraceName() {
 		System.out.println(" ICICI Lombard  -Insurance for Property non-industrial upto Age 2 Cr INR");
 	}

 	@Override
 	public void insuranceDetalis() {
 		System.out.println("Covers Property with Natural Disaster/Accident or Theft ");	
 	}

 	@Override
 	public void insuranceCost() {
 		System.out.println(" Cost per year 255000 INR Including GST / per person..");
 	}
 }
