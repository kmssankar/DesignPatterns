package org.designpattern.behavioral.command;

public class DeployApplication implements Order {

	private HRMApplication  hrmApplicationInsatance = new HRMApplication();
	
	DeployApplication(HRMApplication HRMApp)
	{
		this.hrmApplicationInsatance  = HRMApp;
	}
	
	@Override
	public void processOrder() {
		hrmApplicationInsatance.DeploySoftware();;

	}

}
