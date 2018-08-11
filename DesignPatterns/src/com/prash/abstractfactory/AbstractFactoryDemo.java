package com.prash.abstractfactory;

public class AbstractFactoryDemo {
	
	public static void main(String a[]) {
		
		AbstractFactory af = new FactoryProducer().getAbstractFactory("color");
		System.out.println("instance ==" + af.getShape("circle") );
		Color clr = af.getColor("red");
		clr.getColor();
	}

}
