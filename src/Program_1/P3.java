package Program_1;

public class P3 {
	public String s="Namaskara"; 
	public void ismethod()
	{
		String s="Salam";
		System.out.println(s);
	}
	public static void main(String[] args) {
		P3 p=new P3();
		p.ismethod();
		System.out.println(p.s);
	}

}
