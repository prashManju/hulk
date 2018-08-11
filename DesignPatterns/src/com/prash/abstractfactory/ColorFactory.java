package com.prash.abstractfactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		
		if(color.equals("red")) {
					
					return new Red();
					
				}else if(color.equals("octogan")) {
					
					return new Blue();
					
				}
				// TODO Auto-generated method stub
				return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
