package org.designpattern.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{

	String cardType;
	String cardNumber;
	String expYYMM;
	
	CreditCardPayment(String cardType,String cardNumber,String expYYMM )
	{
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expYYMM = expYYMM;
		
	}
	@Override
	public void pay(int amount) {
		System.out.println("Amount payed via credit Card : " + amount);
		
	}

}
