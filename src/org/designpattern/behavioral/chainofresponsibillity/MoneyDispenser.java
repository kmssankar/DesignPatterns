package org.designpattern.behavioral.chainofresponsibillity;

public abstract class MoneyDispenser {
	
	static int dispense1000 = 1000;
	static int dispense500 = 500;
	static int dispense200 = 200;
	static int dispense100 = 100;
	static int dispense1 = 1;
	
	protected MoneyDispenser nextDispenser;
	
	public void setnextDispenser(MoneyDispenser moneyDispenser)
	{
		this.nextDispenser = moneyDispenser;
	}
	
	public abstract void dispenseAmount(int amount);

}
