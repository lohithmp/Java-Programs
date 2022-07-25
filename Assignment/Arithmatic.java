package Assignment;
import java.util.Scanner;

//Using if else if ladder to perform arithmetic operation 
public class Arithmatic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int first_number=sc.nextInt();
		System.out.println("Enter second number:");
		int second_number=sc.nextInt();
		System.out.println("Enter arithmetic symbol:");
		char function_symbol=sc.next().charAt(0);
		if(function_symbol=='+')
		{
			int add=first_number+second_number;
			System.out.println(first_number+"+"+second_number+"="+add);
		}
		else if(function_symbol=='-') 
		{
			int sub=first_number-second_number;
			System.out.println(first_number+"-"+second_number+"="+sub);
		}
		else if(function_symbol=='*')
		{
			int multiply=first_number*second_number;
			System.out.println(first_number+"*"+second_number+"="+multiply);
		}
		else if(function_symbol=='/')
		{
			int divide=first_number/second_number;
			System.out.println(first_number+"/"+second_number+"="+divide);
		}
		else
		{
			System.out.println("Incorrect arithmetic symbol");
		}
		sc.close();
	}
}
/*OUTPUT:
 * Enter first number:
5
Enter second number:
4
Enter arithmetic symbol:
+
5+4=9
 */

