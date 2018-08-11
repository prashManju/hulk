package com.prash.builder;

import com.prash.builder.SchoolBuilder;

public class MySchool {
	
	public static void main(String a[]) {
		School myschool = new SchoolBuilder().setAverage(9.9).setClassroom("room1").getSchool();
		System.out.println(myschool);
	}

}
