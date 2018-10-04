package org.designpattern.behavioral.chainofresponsibillity;

 class ThousandDispenser extends MoneyDispenser {
	
	public  void dispenseAmount(int amount)
	{
		if (amount >= dispense1000)
			{
				int bills = amount/dispense1000;
				System.out.println( dispense1000 +"  INR Bills : " + bills);
				if ((amount % dispense1000) > 0) 
					{
						nextDispenser.dispenseAmount(amount % 1000);
					}
			}
		else
			{
				nextDispenser.dispenseAmount(amount);
			}
	}

}
 
 
 class FiveHundredDispenser extends MoneyDispenser {
		
	public  void dispenseAmount(int amount)
	{
		if (amount >= dispense500)
			{
				int bills = amount/dispense500;
				System.out.println( dispense500 + " INR Bills : " + bills);
				if ((amount % dispense500) > 0) 
					{
						nextDispenser.dispenseAmount(amount % dispense500);
					}
			}
		else
			{
				nextDispenser.dispenseAmount(amount);
			}
	}

}
 
 class TwoHundredDispenser extends MoneyDispenser {
		
		public  void dispenseAmount(int amount)
		{
			if (amount >= dispense200)
				{
					int bills = amount/dispense200;
					System.out.println( dispense200 + " INR Bills : " + bills);
					if ((amount % dispense200) > 0) 
						{
							nextDispenser.dispenseAmount(amount % dispense200);
						}
				}
			else
				{
					nextDispenser.dispenseAmount(amount);
				}
		}

	}
 
 class OneHundredDispenser extends MoneyDispenser {
		
		public  void dispenseAmount(int amount)
		{
			if (amount >= dispense100)
				{
					int bills = amount/dispense100;
					System.out.println( dispense100 + " INR Bills : " + bills);
					if ((amount % dispense100) > 0) 
						{
							nextDispenser.dispenseAmount(amount % dispense100);
						}
				}
			else
				{
					nextDispenser.dispenseAmount(amount);
				}
		}

	}

 class OnesDispenser extends MoneyDispenser {
		
		public  void dispenseAmount(int amount)
		{
			if (amount >= dispense1)
				{
					int bills = amount/dispense1;
					System.out.println( dispense1 + " INR Bills : " + bills);
				}
		}

	}