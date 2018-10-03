package org.designpattern.behavioral.command;

public class LicenseApplication implements Order {

	private HRMApplication  hrmApplicationInsatance = new HRMApplication();
	
	LicenseApplication(HRMApplication HRMApp)
	{
		this.hrmApplicationInsatance  = HRMApp;
	}
	
	@Override
	public void processOrder() {
		hrmApplicationInsatance.licenseSoftware();

	}

}
