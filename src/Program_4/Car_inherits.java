package Program_4;  //Includes Program 5 topics

import java.util.Scanner;
//Subclass (Car_inherits) inherits Parentclass (Uber_Inheritance)
public class Car_inherits extends Uber_Inheritance 
{
	//Constructor Overloading
	public Car_inherits() 
	{
		super("Sift Dzire"); //Calling Parent Constructor
	}
	//Method Overriding
	@Override
	public void Ride()
	{
	 // Calling parent method
		System.out.println("2."+ mini+" is ready to pick");
		super.Ride_in_bike("Bajaj chethak");
		super.Ride_in_Auto("Auto", 2);
	}
	
	//Method Overriding
	public String Ride_in_bike(String bike_name)
	{
		return bike_name;
	}
	public int Ride_in_Auto(String auto,int seat_capacity)
	{
	    
		return seat_capacity;
	}
	
	public static void main(String[] args) 
	{
		Car_inherits car=new Car_inherits();
		Uber_Inheritance ub=new Car_inherits();
		System.out.println("UBER is offering you to book vehicle");
		System.out.println();
		Scanner sc =new Scanner(System.in);
		car.Ride();
		System.out.println();
		System.out.println("Which one do you want?? ");
		int pick_One =sc.nextInt();
		System.out.println("Thank You ");
		if(pick_One==1)
		{
			System.out.println(ub.getSuv()+" is on the way to pick you ");
		}
		else if(pick_One==2)
		{
			System.out.println(car.mini+"  is on the way to pick you ");
		}
		else if(pick_One==3)
		{
			System.out.println(car.Ride_in_bike("Bajaj chethak")+" is on the way to pick you");
		}
		else if(pick_One==4)
		{
			System.out.println(car.Ride_in_Auto("Auto", 2)+" seat passengers only to allow and auto is on the way to pick you");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
		sc.close();
	}
}


/*OUTPUT:
 * UBER is offering you to book vehicle

1.Tata Nexon is ready to pick
2.Sift Dzire is ready to pick
3.Bajaj chethak is ready to pick
4.Auto is ready to pick, only for 2 seat passengers

Which one do you want?? 
3
Thank You 
Bajaj chethak is on the way to pick you
 */



