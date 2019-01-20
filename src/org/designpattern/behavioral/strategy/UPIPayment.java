package org.designpattern.behavioral.strategy;

public class UPIPayment implements PaymentStrategy {

	String mobileNumber;
	String authNumber;
	
	UPIPayment(String mobileNumber,String authNumber)
	{
		this.mobileNumber = mobileNumber;
		this.authNumber = authNumber;
	}
	@Override
	public void pay(int amount) {
		System.out.println("Amount Paid via UPI : " + amount);

	}

}
