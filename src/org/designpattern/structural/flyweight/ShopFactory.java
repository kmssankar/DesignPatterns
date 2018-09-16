package org.designpattern.structural.flyweight;

import java.util.HashMap;

public class ShopFactory {
	
	static final HashMap<String,Shop>  ShopMap= new HashMap<String ,Shop>();
	
	public static Shop getShop(OnlineSite site)
	{
		Shop shopSelected = (Shop)ShopMap.get(site.category);
		
		if (shopSelected == null)
				{
					System.out.println(" Site Added : " + site.url);
					shopSelected = new OnlineShop(site.category,site.url,site.rating);
					ShopMap.put(site.category, shopSelected );
				}
		return shopSelected;
	}
}
