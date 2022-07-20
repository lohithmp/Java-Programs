package Program_4;

//Using Aggregation to find fruit details 
 class Aggregation 
{
	String fruit_name;
	int fruit_price;
	int fruit_weight;
	
	public Aggregation(String fn,int fp,int fw) 
	{
		fruit_name=fn;
		fruit_price=fp;
		fruit_weight=fw;
	}
}
 
 class Fruitshop
 {
	 String Shop_name;
	 Aggregation Fruit_details;
	 
	 public Fruitshop(String sn, Aggregation fd)
	 {
		 Shop_name=sn;
		 Fruit_details=fd;
	 }
	 public static void main(String[] args) 
	 {
		Aggregation ag=new Aggregation("Mango",60, 2);
		Fruitshop fs=new Fruitshop("SweetFruits",ag);
		System.out.println(fs.Shop_name);
		System.out.println(fs.Fruit_details.fruit_name);//using Fruitshop reference we get access the Aggregation class data members
		System.out.println(fs.Fruit_details.fruit_price);
		System.out.println(fs.Fruit_details.fruit_weight);
		
	 }
 }
