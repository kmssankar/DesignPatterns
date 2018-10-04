package org.designpattern.behavioral.templatemethod;

public class CarService extends VehicleService{

	@Override
	void electricalsCheckup() {
		billSummary = billSummary + " Electricals Checkup(320) ;";
		total = total + 320;
	}

	@Override
	void engineCheckup() {
		billSummary = billSummary + " + engine Checkup(400) ;";
		total = total + 400;
		
	}

	@Override
	void oilChange() {
		billSummary = billSummary + " + oilChange(3700) ;";
		total = total + 3700;
		
	}

	@Override
	void washservice() {
		billSummary = billSummary + " + washservice + 3M Wax (650) ;";
		total = total + 650;
		
	}

}
