package Program_5;

//using Polymorphism Calculation of triangle and circle
class Mathematics 
{
	int height=45;
	int breadth=20;
	
	//Override triangle to calculation class
	public void Triangle()
	{
		double area_of_traiangle=0.5*height*breadth;
		System.out.println("Area of traiangle is "+area_of_traiangle);
	}
	//Using Overloading Calculate the area of circle
	public void Circle(int radius)
	{
		double area_of_circle=3.1472*radius*radius;
		System.out.println("Area of Circle is "+area_of_circle);
	}
	//Using overloading Calculate the area of circle with given value of pie in parameter
	public void Circle(int radius, double pie)
	{
		double area_of_Circle=pie*radius*radius;
		System.out.println("Area of circle is "+area_of_Circle);
	}
}

class Calculation extends Mathematics
{
	int height_1=15;
	int breadth_1=20;
	//Override from Mathematics class 
	@Override
	public void Triangle() 
	{
		double area_of_traingle=0.5*height_1*breadth_1;
		System.out.println("Area of Triangle is "+area_of_traingle);
	}
	public static void main(String[] args) 
	{
		Calculation obj_cal=new Calculation();
		Mathematics obj_math=new Mathematics();
		obj_cal.Triangle();// Calling Triangle using Calculation class object
		obj_math.Triangle();// Calling Triangle using Mathematics class object
		obj_math.Circle(50);// Calling Triangle using Mathematics class object
		obj_math.Circle(20,3.1472);// Calling Triangle using Mathematics class object
		
	}
	
}
