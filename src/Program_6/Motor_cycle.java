package Program_6;

//Using Abstract class to get the bike details 
 public abstract class Motor_cycle 
{
	private int bike_price=90000;
	//Using abstract method declaration for Splendor method
	protected abstract void Splendor(int bike_cc);
	//Using getter and setter method to get access of bike_price variable
	public int getBike_price() 
	{
		return bike_price;
	}
	public void setBike_price(int bike_price) 
	{
		this.bike_price = bike_price;
	}
	public void Splendor_price()
	{
		System.out.println("Splendor bike price:"+getBike_price()+"Rupee");
	}
}
 class Motor_shop extends Motor_cycle
{
	 //Implement the abstract method of Splendor method of Motor_cycle
	@Override
	public void Splendor(int bike_cc) 
	{
		System.out.println("Splendor bike cc: "+bike_cc);
	}
	public static void main(String[] args) 
	{
		Motor_cycle moto=new Motor_shop();
		moto.Splendor(450);
		moto.Splendor_price();
	}
	
}
