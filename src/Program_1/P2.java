package Program_1;

public class P2 {
	public static int A=111;
public static void main(String[] args) {
	P2 o=new P2();
	P2 o1=new P2();
	P2 o2=new P2();
	System.out.println(o.A);
	System.out.println(o1.A);
	System.out.println(o2.A);
	
	o2.A=999;
	System.out.println(o.A);
	System.out.println(o1.A);
	System.out.println(o2.A);
	
}
}
