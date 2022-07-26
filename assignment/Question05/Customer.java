package com.josh.training.oopsconcepts.assignment.Question05;
//Customer class for details of customer
public class Customer 
{
	String name;
	boolean member=false;
	String memberType;
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	public String getName()
	{
		return name;
		
	}
	public boolean isMember()
	{
		return member;
		
	}
	public String getMemberType()
	{
		return memberType;
	}
	public void setMemberType(boolean member)
	{
		this.member=member;
	}

	public void setMemberType(String type)
	{
		this.memberType=type;
	}
	@Override
	public String toString() 
	{
		return "Customer name=" + name + ", member=" + member + ", memberType=" + memberType ;
	}
}
