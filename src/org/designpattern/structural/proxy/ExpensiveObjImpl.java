package org.designpattern.structural.proxy;

public class ExpensiveObjImpl implements ExpensiveObj {

	ExpensiveObjImpl()
	{
		InitExpensiveObj();
	}
	
	@Override
	public void run() {
		System.out.println("Executing the Excpected Method of expensive obj !");

	}
	
	private void InitExpensiveObj()
	{
		System.out.println("Initializing Expensive obj !! ");
	}

}
