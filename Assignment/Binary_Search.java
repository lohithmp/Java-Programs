package Assignment;
import java.util.Scanner;
//Using while loop to find the index of element
public class Binary_Search 
{
	public static void Search_Index(int array[],int first_index,int last_index,int key)
	{
		int middle_index=(first_index+last_index)/2;
		while(first_index<=last_index)
		{
			if(array[middle_index]>key)
			{
				last_index=middle_index-1;
			}
			else if(array[middle_index]<key)
			{
				first_index=middle_index+1;
			}
			else
			{
				System.out.println("The searching element is present in "+middle_index+" index");
				break;
			}
			middle_index=(first_index+last_index)/2;
		}
		if(first_index>last_index)
		{
			System.out.println("Element not found in the given array");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int array[]= {10,15,25,28,80,92,98,99};
		int last_index=array.length-1;
		int first_index=0;
		System.out.println("Enter the searching element here");
		int search_element=sc.nextInt();
		Search_Index(array,first_index,last_index,search_element);//calling search_index method
		sc.close();
	}
}
/*OUTPUT
 * Enter the searching element here
	25
	The searching element is present in 2 index
 */
