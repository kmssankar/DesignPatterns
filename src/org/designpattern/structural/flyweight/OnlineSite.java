package org.designpattern.structural.flyweight;

public class OnlineSite {
	
	String category;
	String url;
	int rating;
	
	public OnlineSite(String category, String url, int rating) {
		super();
		this.category = category;
		this.url = url;
		this.rating = rating;
	}
}
