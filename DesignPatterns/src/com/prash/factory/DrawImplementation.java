package com.prash.factory;

public class DrawImplementation {
	
	public DrawInterface getShapeInstance(String str) {
		
		if(str.equals("rect")) {
			
			return new DrawRectangle();
			
		}else if(str.equals("square")) {
			
			return new DrawSquare();
			
		}
		
		return null;
	}

}
