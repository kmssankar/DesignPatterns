package org.designpattern.structural.flyweight;

/*Flyweight pattern
-------------------
Flyweight pattern is primarily used to reduce the number of objects created and 
to decrease memory footprint and increase performance. 
This type of design pattern comes under structural pattern as 
this pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.*/

public class FlyweightMain {

	public static void main(String[] args) {
		
		OnlineSite[] siteList = {new OnlineSite("Fashion " ,"www.Myntra.com" ,5), new OnlineSite("Watches " ,"www.ethosWatches.com" ,4),
				new OnlineSite("Electronics " ,"www.flipkart.com" ,5),new OnlineSite("Automobile " ,"www.brkskoda.com" ,5),
				new OnlineSite("Spares " ,"www.Aliexpress.com" ,5)};
		
		for (int i =0;i<10;i++)
			{
				Shop shopInstance = ShopFactory.getShop( siteList [(int) (Math.random()*siteList.length)]);
				shopInstance.sell();
			}

	}

}

/*OUTPUT
Site Added : www.flipkart.com
Site : www.flipkart.com Sells :  Electronics  User Rating : 5
Site : www.flipkart.com Sells :  Electronics  User Rating : 5
Site Added : www.brkskoda.com
Site : www.brkskoda.com Sells :  Automobile  User Rating : 5
Site Added : www.ethosWatches.com
Site : www.ethosWatches.com Sells :  Watches  User Rating : 4
Site Added : www.Myntra.com
Site : www.Myntra.com Sells :  Fashion  User Rating : 5
Site : www.Myntra.com Sells :  Fashion  User Rating : 5
Site : www.brkskoda.com Sells :  Automobile  User Rating : 5
Site : www.flipkart.com Sells :  Electronics  User Rating : 5
Site : www.flipkart.com Sells :  Electronics  User Rating : 5
Site Added : www.Aliexpress.com
Site : www.Aliexpress.com Sells :  Spares  User Rating : 5*/