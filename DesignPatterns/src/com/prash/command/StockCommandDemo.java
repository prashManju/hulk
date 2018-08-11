package com.prash.command;

public class StockCommandDemo {
	
	public static void main(String a[]) {
		StockRequest stock = new StockRequest();
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		
		StockBroker broker = new StockBroker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		
		broker.placeOrders();
		
	}

}
