package com.prash.factory;

public class DrawShapes {
	
	public static void main(String a[]) {
		DrawImplementation dimpl = new DrawImplementation();
		DrawInterface di = dimpl.getShapeInstance("rect");
		if(di != null) {
			di.shape();
		}else {
			System.out.println("No instance found-->");
		}
		
		
	}

}
