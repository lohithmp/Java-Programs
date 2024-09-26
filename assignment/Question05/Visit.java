package com.josh.training.oopsconcepts.assignment.Question05;
import java.util.Date;
//Customer visit the beauty salon which provides services and sells beauty products
public class Visit
{
	Customer Customer ;
	Date date;
	double serviceExpense;
	double productExpense;

	public Visit(Customer name,Date date) 
	{
		this.Customer = name;
		this.date = date;
	}
	public String getName()
	{
		return Customer.getName();
	}
	public double getServiceExpense()
	{
		return serviceExpense;	
	}
	public void setServiceExpense(double serviceExpense)
	{
		this.serviceExpense=serviceExpense;
	}
	public double getProductExpense()
	{
		return productExpense;
		
	}
	public void setProductExpense(double productExpense)
	{
		this.productExpense=productExpense;
	}
	//Total Expense of services and sells beauty products
	public double getTotalExpense()
	{
		return(serviceExpense-(serviceExpense*DiscountRate.getServiceDiscountRate(Customer.getMemberType())))
				+(productExpense-(productExpense*DiscountRate.getProductDiscountRate(Customer.getMemberType())));
	}
	//Details of Customer membership
	@Override
	public String toString() {
		return   "customer name=" + Customer.getName() + ", customer member=" + Customer.isMember()
		+ ", customer member type=" + Customer.getMemberType() + ", date=" + date + ", serviceExpense="
		+ serviceExpense + "$, productExpense=" + productExpense + "$";
	}
	
}
