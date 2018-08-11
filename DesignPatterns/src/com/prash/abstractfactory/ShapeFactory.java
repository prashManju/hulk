package com.prash.abstractfactory;


public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		
		if(shape.equals("circle")) {
			
			return new Circle();
			
		}else if(shape.equals("octogan")) {
			
			return new Octogan();
			
		}
		// TODO Auto-generated method stub
		return null;
	}

}
