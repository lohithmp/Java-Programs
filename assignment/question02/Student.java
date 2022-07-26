package com.josh.training.oopsconcepts.assignment.question02;
//Student class is sub class of Person class 
//In this code for implementation of Student details
public class Student extends Person
{
	String program;
	int year;
	public Student(String name, String program,String address,int year, double fee ) 
	{
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	double fee;
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() 
	{
		return "Student :name= "+name+", program= " + program + ", year= " + year + ", fee= " + fee +"Rupee";
	}
	
}
