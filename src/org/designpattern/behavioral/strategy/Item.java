package org.designpattern.behavioral.strategy;

public class Item {
	
	int UPCCode;
	int price;
	public Item(int uPCCode, int price) {
		super();
		UPCCode = uPCCode;
		this.price = price;
	}
	public int getUPCCode() {
		return UPCCode;
	}
	public void setUPCCode(int uPCCode) {
		UPCCode = uPCCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
