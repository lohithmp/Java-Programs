package Assignment;

//Using for loop to print addition of given number and average 
public class Sum_Average_Running_int 
{
	public static void main(String[] args) 
	{
		int final_number=100;
		int sum=0;
		double average;
		int i;
		for( i=1;i<=final_number;i++)
		{
			sum=sum+i;
		}
		double added=sum;
		System.out.println("The sum of 1 to 100 is "+sum);//To display the adding number of 1 to 100
		average=added/100;
		System.out.println("The average is "+average);//To display average to 1 to 100 number
	}		
}
/*OUTPUT
 * The sum of 1 to 100 is 5050
	The average is 50.5

 */
