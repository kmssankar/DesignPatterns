package org.designpattern.behavioral.chainofresponsibillity;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainofresponsibillityMain {

	public static void main(String[] args) {
		ThousandDispenser thousandDispenser = new ThousandDispenser();
		FiveHundredDispenser fiveHundredDispenser = new FiveHundredDispenser();
		TwoHundredDispenser twoHundredDispenser  = new TwoHundredDispenser();
		OneHundredDispenser oneHundredDispenser = new OneHundredDispenser();
		OnesDispenser onesDispenser = new OnesDispenser();
		
		thousandDispenser.setnextDispenser(fiveHundredDispenser);
		fiveHundredDispenser.setnextDispenser(twoHundredDispenser);
		twoHundredDispenser.setnextDispenser(oneHundredDispenser);
		oneHundredDispenser.setnextDispenser( onesDispenser);
		
		// Do Work
		
		BufferedReader  Br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
				System.out.println("Enter Amount : ");
				int  Input = Integer.parseInt(Br.readLine());
				thousandDispenser.dispenseAmount(Input);
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		

	}

}


/*OUTPUT:
Enter Amount : 
23930
1000  INR Bills : 23
500 INR Bills : 1
200 INR Bills : 2
1 INR Bills : 30	*/