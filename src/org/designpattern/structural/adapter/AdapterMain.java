package org.designpattern.structural.adapter;

/*
 Adapter Pattern

An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".
In other words, to provide the interface according to client requirement while using the services of a class with a different interface.
The Adapter Pattern is also known as Wrapper.

Advantage of Adapter Pattern
It allows two or more previously incompatible objects to interact.
It allows reusability of existing functionality.
 */

public class AdapterMain {

	public static void main(String[] args) {
		CreditCard creditCardInst = new BankCustomer();
		creditCardInst.getAccDetails();
		creditCardInst.showAccDetails();
	}

}

/*OUTPUT
Enter Account Input : 
22
Enter Account Holder Name : 
Sankar
Enter Account Type : 
Savings
Account Details :  
 AccNum :22
 AccType : Savings
 Holdername : Sankar
 Account Verified and eligible for Credit card !!*/