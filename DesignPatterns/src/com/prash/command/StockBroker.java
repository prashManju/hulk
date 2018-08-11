package com.prash.command;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
	
	private List<Order> orderlist = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderlist.add(order);
	}
	
	public void placeOrders() {
		
		for(Order order : orderlist) {
			
			order.execute();
			
		}
		orderlist.clear();
		
	}

}
