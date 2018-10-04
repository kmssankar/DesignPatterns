package org.designpattern.behavioral.templatemethod;

public class BikeService extends VehicleService{

	@Override
	void electricalsCheckup() {
		billSummary = billSummary + " Electricals Checkup(120) ;";
		total = total + 120;
	}

	@Override
	void engineCheckup() {
		billSummary = billSummary + " + engine Checkup(100) ;";
		total = total + 100;
		
	}

	@Override
	void oilChange() {
		billSummary = billSummary + " + oilChange(350) ;";
		total = total + 350;
		
	}

	@Override
	void washservice() {
		billSummary = billSummary + " + washservice(150) ;";
		total = total + 150;
		
	}

}
