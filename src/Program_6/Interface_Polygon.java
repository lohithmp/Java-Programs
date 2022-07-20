package Program_6;

//using Interface to calculate the  polygon
 interface Interface_Polygon 
{
	 void getArea_result();
}

 //Rectangle class implements interface 
 class Rectangle implements Interface_Polygon
 {
	@Override
	public void getArea_result()
	{
		int length=5;
		int breadth=10;
		int area_of_rectangle=length*breadth;
		System.out.println("Area of Rectangle is "+area_of_rectangle);
	} 
 }
 
 //Triangle class implements interface 
 class Triangle implements Interface_Polygon
 {
	 @Override
	public void getArea_result()
	{
		 int length=6;
		 int breadth=10;
		 double area_of_triangle=0.5*(length*breadth);
		 System.out.println("Area of Triangle is "+area_of_triangle);
	}
 }
 class Main
 {
	 public static void main(String[] args) 
	 {
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Triangle t1=new Triangle();
		r.getArea_result();
		t.getArea_result();
		t1=null;
	    System.gc();   // System.gc(); invokes JVM for garbage collection
	  }
 }

 /*OUTPUT:
  * Area of Rectangle is 50
	Area of Triangle is 30.0

  */
 
