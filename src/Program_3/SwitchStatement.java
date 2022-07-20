package Program_3;
import java.util.Scanner;
public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//To access the machine operation  
		System.out.println("enter the Character for which machine you want to trun on");
		char ch=sc.next().charAt(0);
			switch(ch)
			{
				case'A':
					System.out.println("machine A is turn on");
					break;
				case'B':
					System.out.println("machine B is turn on");
					break;
				case'C':
					System.out.println("machine C is turn on");
					break;
				case'D':
					System.out.println("machine D is turn on");
				default:
					System.out.println("Invalid Input");
			}
			sc.close();
	
	}
}
