package org.designpattern.behavioral.strategy;

import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList<Item> itemList= new ArrayList<Item>();
	
	void addToCart(Item item)
	{
		itemList.add(item);
	}
	
	public int getTotal()
	{
		int sum = 0;
		for(Item each: itemList)
			{
				sum += each.getPrice();
			}
		return sum;
	}

	public void payAmount(PaymentStrategy paymentStrategy)
	{
		paymentStrategy.pay(getTotal());
	}
}
