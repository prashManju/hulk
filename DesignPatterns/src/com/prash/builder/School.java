package com.prash.builder;

public class School {
	
	private String classroom;	
	private int students;
	private double average;
	private String medium;
	
	public School(String classroom, int students, double average, String medium) {
		super();
		this.classroom = classroom;
		this.students = students;
		this.average = average;
		this.medium = medium;
	}
	
	@Override
	public String toString() {
		return "School [classroom=" + classroom + ", students=" + students + ", average=" + average + ", medium="
				+ medium + "]";
	}
}
