package com.prash.command;

public class BuyStock implements Order{
	
	public StockRequest stock;
	
	public BuyStock(StockRequest stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
		
	}

}
