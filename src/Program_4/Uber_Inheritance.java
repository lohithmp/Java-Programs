package Program_4;

public class Uber_Inheritance 
{
	private String suv="Tata Nexon";
	protected String mini;
	
		//Parametrized Contructor 
	 Uber_Inheritance(String car_name)
	{
		mini=car_name;
	}

	 //Instance method
	public void Ride() 
	{
		System.out.println("1."+getSuv()+" is ready to pick");
	}
	
	//Method Overloading
	public String Ride_in_bike(String bike_name)
	{
		System.out.println("3."+bike_name+" is ready to pick");
		return bike_name;
	}
	public int Ride_in_Auto(String auto, int seat_capacity )
	{
		System.out.println("4.Auto is ready to pick, only for "+seat_capacity+" seat passengers");
		return seat_capacity;
	}
	
	//Using getter and setter method to access private variable from Uber_Inheritance to Car_inherits
	public String getSuv() {
		return suv;
	}

	public void setSuv(String xuv) {
		this.suv = xuv;
	}
	
}
