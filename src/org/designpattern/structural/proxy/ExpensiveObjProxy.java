package org.designpattern.structural.proxy;

public class ExpensiveObjProxy implements ExpensiveObj {

	private static ExpensiveObjImpl object;
	@Override
	public void run() {

		if(object == null)
		{
			object = new ExpensiveObjImpl();
			System.out.println("New Object Created ");
		}
		
		object.run();
	}

}
