package org.designpattern.structural.facade;

public class InsuranceAgent {
	
	public VehicleInsurance vehicleInsurance;
	public HealthInsurance healthInsurance;
	public PropertyInsurance propertyInsurance;
	
	InsuranceAgent()
	{
		vehicleInsurance = new VehicleInsurance();
		healthInsurance = new HealthInsurance();
		propertyInsurance = new PropertyInsurance();
	}

	public void sellVehicleInsurence()
	{
		vehicleInsurance.insuraceName();
		vehicleInsurance.insuranceDetalis();
		vehicleInsurance.insuranceCost();
	}
	
	public void sellHealthInsurence()
	{
		healthInsurance.insuraceName();
		healthInsurance.insuranceDetalis();
		healthInsurance.insuranceCost();
	}
	public void sellPropertyInsurence()
	{
		propertyInsurance.insuraceName();
		propertyInsurance.insuranceDetalis();
		propertyInsurance.insuranceCost();
	}
	
}
