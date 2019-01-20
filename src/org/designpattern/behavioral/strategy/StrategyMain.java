package org.designpattern.behavioral.strategy;

public class StrategyMain {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		Item item01 = new Item(2213 , 23);
		Item item02 = new Item(2215 , 25);
		
		cart.addToCart(item01);
		cart.addToCart(item01);
		cart.addToCart(item02);
		
		cart.payAmount(new CreditCardPayment("VISA","2231334343","2203"));
		cart.payAmount(new UPIPayment("+918872122333","34343"));
	}

}

/*OUTPUT:
Amount payed via credit Card : 71
Amount Paid via UPI : 71*/
