package org.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class AppReseller {
	
	List<Order> orderList = new ArrayList<Order>();
	
	void addOrder(Order orderInput)
	{
		orderList.add(orderInput);
	}
	
	
	void processOrder()
	{
		for(Order order : orderList)
			{
				order.processOrder();
			}
		orderList.clear();
	}

}
