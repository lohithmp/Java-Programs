package Assignment;
import java.util.Scanner;
//Using for loop to print the Check Pattern
public class Checker_Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int length=sc.nextInt();
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(i%2==0)
				{
					System.out.print("#");
					System.out.print(" ");
				}
				else  
				{
					System.out.print(" ");
					System.out.print("#");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
/*OUTPUT
 * Enter the size: 7
# # # # # # # 
 # # # # # # #
# # # # # # # 
 # # # # # # #
# # # # # # # 
 # # # # # # #

 */
