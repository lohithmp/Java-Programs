package com.josh.training.oopsconcepts.assignment.question02;
//Person is superclass to Staff class and Student class
public class Person 
{
	String name;
	String address;
	public Person(String name, String address) 
	{
		this.name = name;
		this.address = address;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getName() 
	{
		return name;
	}
	@Override
	public String toString() {
		return "Person [getName()=" + getName() +"getAddress()=" + getAddress() + "]";
	}
	
	
}
