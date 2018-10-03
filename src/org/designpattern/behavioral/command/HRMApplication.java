package org.designpattern.behavioral.command;

public class HRMApplication {
	
	String application = "Peoplesoft HRM for NA";
	int namedUsers  = 200;
	
	public void licenseSoftware()
	{
		System.out.println( application + " licensed to  " + namedUsers + " namedUsers !");
	}
	
	public void DeploySoftware()
	{
		System.out.println( application + " deployed in  Oracle cloud!" );
	}

}
