package org.designpattern.behavioral.templatemethod;

public abstract class VehicleService {
	
	int total = 0;
	String billSummary = " ";
	
	abstract void electricalsCheckup();
	abstract void engineCheckup();
	abstract void oilChange();
	abstract void washservice();
	
	public void doService()
	{
		electricalsCheckup();
		engineCheckup();
		oilChange();
		washservice();
		
		System.out.println("Bill summary : \n " + billSummary);
		System.out.println(" Total Amount to be Paid -> " + total);
	}
	

}
