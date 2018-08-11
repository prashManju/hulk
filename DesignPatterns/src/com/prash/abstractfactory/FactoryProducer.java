package com.prash.abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getAbstractFactory(String str) {
		
		if(str.equals("shape")) {
			
			return new ShapeFactory();
			
		}else if(str.equals("color")) {
			return new ColorFactory();
		}
		
		return null;
	}

}
