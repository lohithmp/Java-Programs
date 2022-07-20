package Program_4;

class Association 
{
	String mobile_name;
	int mobile_price;
	public Association(String mn,int mp) 
	{
		mobile_name=mn;
		mobile_price=mp;
	}
}
class Mobile extends Association
{
	int mobile_ram;
	public Mobile(int mr,String mn,int mp)
	{
		super(mn,mp);
		this.mobile_ram=mr;
	}
	
}

class Mobile_Shop
{
	public static void main(String[] args) 
	{
		Mobile m=new Mobile(6, "Vivo", 300);
		System.out.println(m.mobile_name+" mobile price is "+m.mobile_price+"$ and  mobile ram is "+m.mobile_ram+"gb");
	}
}