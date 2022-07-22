package Program_7;
import java.util.Scanner;
<<<<<<< HEAD
//Class Atm is super class to IncorrectPinException class
=======

//Custom Exception 
>>>>>>> bf98a82cc51bce26c8a323af8fa5e9e382a889d9
public class Atm 
{
	int atm_pin=4512;
	public void Atmpin(int entered_atm_pin) throws IncorrectPinException  //throws keyword to display the exception
	{
			if(atm_pin==entered_atm_pin)
			{
				System.out.println("Your pin is correct");
			}
			else
			{
				throw new IncorrectPinException("Please enter correct pin");   // using throw keyword to display precise sequence of steps leading to the exception
			}
	}
	public static void main(String[] args) 
	{
		Atm a= new Atm();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your atm pin");
		//try block to check the risky line of code
		try 
		{
			int entered_atmpin=sc.nextInt();
			a.Atmpin(entered_atmpin);
		}
		//catch block to handle the exception
		catch(IncorrectPinException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Thank You");
		}	
		sc.close();
	}
}
