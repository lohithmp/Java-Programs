package Program_3;
import java.util.Scanner;
public class If_elseif_ladder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		// Check the presence of the number
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number>=1&&number<10)
		{
			System.out.println("Number is present in 1 to 10 numbers");
		}
		else if(number>10&&number<50)
		{
			System.out.println("Number is present in 10 to 50 numbers ");
		}
		else if(number>50&&number<100)
		{
			System.out.println("Number is present in 50 to 100 numbers ");
		}
		else
		{
			System.out.println("Number is present in above 100 numbers");
		}
		sc.close();
	}

}
