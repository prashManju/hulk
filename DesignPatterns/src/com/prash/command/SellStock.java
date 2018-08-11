package com.prash.command;

public class SellStock implements Order{
	
	public StockRequest stock;
	

	public SellStock(StockRequest stock) {
		this.stock = stock;
	}



	@Override
	public void execute() {
		stock.sell();
		
	}

}
