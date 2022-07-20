package Program_3;
import java.util.Scanner;
public class WhileLoop 				
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int i=0;
		//To add the number
		System.out.println("Enter the number to sum");
		int number=sc.nextInt();
		int sum=0;
		while(i<number)
		{
			sum+=sc.nextInt();
			System.out.println(sum);
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
