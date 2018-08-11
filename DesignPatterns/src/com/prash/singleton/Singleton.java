package com.prash.singleton;

public class Singleton {
	
	public static void main(String a[]) {
		Single s1 = Single.getObj();
		Single s2 = Single.getObj();
	}

}



class Single{
	private static Single s ;
	
	private Single() {
		System.out.println("Heloo 1");
	}
	public static Single getObj() {
		if(s==null) {
			s = new Single();
		}
		
		return s; 
	}
	
}