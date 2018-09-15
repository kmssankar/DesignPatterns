package org.designpattern.structural.adapter;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankAccount implements CreditCard {

	@Override
	public void getAccDetails() {
		
		BufferedReader biStr = new BufferedReader( new InputStreamReader(System.in));
		try
			{
				System.out.println("Enter Account Input : ");
				Integer accnumInp = Integer.parseInt( biStr.readLine());
				System.out.println("Enter Account Holder Name : ");
				String  nameInp =  biStr.readLine();
				System.out.println("Enter Account Type : ");
				String  type =  biStr.readLine();
				setAccNumber(accnumInp);
				setAccType(type);
				setName(nameInp);
				
			} catch (NumberFormatException | IOException e)
			{
				e.printStackTrace();
			}
	
	}

	@Override
	public void showAccDetails() {
	
		System.out.println("Account Details :  \n AccNum :" + accNumber + "\n AccType : " + accType + "\n Holdername : "+ name);
		System.out.println(" Account Verified and eligible for Credit card !!");
		
	}

}
