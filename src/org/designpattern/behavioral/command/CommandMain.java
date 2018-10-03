package org.designpattern.behavioral.command;

/*Command Design Pattern
	 Command pattern works by wrapping the request from the sender in an object called a command. 
	 This command is then passed to the invoker object, which proceeds to look for the adequate way to process the request.
*/

public class CommandMain {

	public static void main(String[] args) {

		HRMApplication hrmApplication = new HRMApplication();

		LicenseApplication licenseApplication = new LicenseApplication(hrmApplication);
		DeployApplication deployApplication = new DeployApplication(hrmApplication);

		AppReseller appReseller = new AppReseller();
		appReseller.addOrder(deployApplication);
		appReseller.addOrder(deployApplication);
		appReseller.addOrder(licenseApplication);
		
		appReseller.processOrder();
	}
}


/*OUTPUT:
	Peoplesoft HRM for NA deployed in  Oracle cloud!
	Peoplesoft HRM for NA deployed in  Oracle cloud!
	Peoplesoft HRM for NA licensed to  200 namedUsers !*/