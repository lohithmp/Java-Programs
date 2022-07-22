package Program_6_Oops;
import java.util.Scanner;
//Class Bank_customer achieve multiple inheritance
public  class Bank_Customer extends Bank_loan  implements Bank 
{
	public String Customer_name;
	final int Customer_AccountNo = 789456;
	static String IFSC_Code="ABC000123";
	private long savings;
	//Constructor used for initialize the customer name
	public Bank_Customer(String c_name)
	{
		this.Customer_name=c_name;
	}
	//Using Encapsulation for private variable savings
	public long getSavings() 
	{
		return savings;
	}
	public void setSavings(long savings)
	{
		this.savings = savings;
	}
	
	//implementation of Bank_Address method present in interface Bank (polymorphism)
	@Override
	public void Bank_Address()
	{
		System.out.println("Branch: BTM 2nd stage, Bengaluru");
	}
	
	//using method overriding from Bank_loan parent class 
	@Override
	public void Home_loan()
	{
	    //using super keyword to call super class Home_loan method
		super.Home_loan();
		System.out.println("You are eligible for to take Home loan ");
	}
		
	public void Car_loan()
	{
			System.out.println("You are eligible for to take Car loan");
	}
	public static void main(String[] args)
	{
		Bank_Customer b1=new Bank_Customer("shankar");
		Bank_Customer b= new Bank_Customer("Anirudh");
		//we are intentionally assigning reference b to another reference b1 to make object referenced by b1 is unusable
		b1=b;
		//Request to JVM for garbage collection by calling system.gc() method
		System.gc();
		b.setSavings(500000);
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Bank");
		System.out.println();
		System.out.println("     Hi "+b.Customer_name);
		System.out.println();
		System.out.println("Choose the option to Banking");
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Account details");
		System.out.println("C. Want to take loans");
		 
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case'A':
				System.out.println("Your bank balance is "+b.getSavings());
				break;
			case'B':
				System.out.println("  " +b.Customer_name+"'s Account details");
				System.out.println("A/c No: "+b.Customer_AccountNo);
				System.out.println("IFSC Code: "+b.IFSC_Code);
				b.Bank_Address();
				break;
			case'C':
				System.out.println("1. Home Loan");
				System.out.println("2. Car Loan");
				int entered_input=sc.nextInt();
				if(entered_input==1)
				{
					b.Home_loan();
					break;
				}
				else if(entered_input==2)
				{
					b.Car_loan();
					break;
				}
				else
				{
					System.out.println("Invalid Input");
					break;
				}
			 default:
				 System.out.println("Invalid Input, Please enter correct input ");	
		}
	}
}
