package Program_3;
import java.util.Scanner;
public class Forloop 
{
	public static void main(String[] args) 
	{
	/*for( ; ; )  Infinite Loop
	{
		System.out.println("a");  //Infinite Loop
	}*/
		System.out.println("");
		Scanner sc=new Scanner(System.in);
		//To print the pattern
		System.out.println("Enter the number to print pattern");
		int numOf_Line=sc.nextInt();
		for(int i=0;i<numOf_Line;i++)
		{
	
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
		sc.close();
	}
}
