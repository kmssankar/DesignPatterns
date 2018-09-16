package org.designpattern.structural.flyweight;

public class OnlineShop implements Shop{
	
	String category;
	String url;
	int rating;
	
	public OnlineShop(String category, String url, int rating) {
		super();
		this.category = category;
		this.url = url;
		this.rating = rating;
	}

	@Override
	public void sell() {
		System.out.println(" Site : " + url + " Sells :  " + category + " User Rating : " + rating);
		
	}
}
