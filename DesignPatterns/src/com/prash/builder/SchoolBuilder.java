package com.prash.builder;

public class SchoolBuilder {
	
	private String classroom;	
	private int students;
	private double average;
	private String medium;
	
	public SchoolBuilder setClassroom(String classroom) {
		this.classroom = classroom;
		return this;
	}
	public SchoolBuilder setStudents(int students) {
		this.students = students;
		return this;
	}
	public SchoolBuilder setAverage(double average) {
		this.average = average;
		return this;
	}
	public SchoolBuilder setMedium(String medium) {
		this.medium = medium;
		return this;
	}
	
	public School getSchool() {
		
		return new School(classroom, students, average, medium);
	}

}
