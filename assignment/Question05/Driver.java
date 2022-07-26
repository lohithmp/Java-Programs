package com.josh.training.oopsconcepts.assignment.Question05;
import java.util.Date;
import java.util.Scanner;

import com.josh.training.oopsconcepts.assignment.question02.Staff;
import com.josh.training.oopsconcepts.assignment.question02.Student;
//Driver class to run programs of Discount system and school details
public class Driver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to run the program");
		System.out.println();
		System.out.println("Enter 1 for School details question ");
		System.out.println("Enter 2 for Discount System question");
		//Enter number to run the program
		int choose_question=sc.nextInt();
		switch(choose_question)
		{
			case 1:
				Student std_details = new Student("Mahesh","Java Full Stack","Bengaluru",2022 , 25000);
				Staff staff_details = new Staff("Unacademy","bang","Shidhar", 60000.00);
				System.out.println(std_details);
				System.out.println(staff_details);
				break;
			case 2:
				Customer cust=new Customer("Karthik");
				cust.member=true;
				cust.memberType="Gold";
		
				Visit visit=new Visit(cust, new Date());
				System.out.println(cust.toString());
		
				visit.setServiceExpense(90.0);
				visit.setProductExpense(50.0);
				System.out.println(visit.toString());
				System.out.println("Total Expense of "+ visit.Customer.getName()+"="+visit.getTotalExpense()+"$");
				break;
			default:
				System.out.println("Invalid Input");
		}
		sc.close();
	}
}

/*OUTPUT:
 * Enter the number to run the program

Enter 1 for School details question 
Enter 2 for Discount System question
2
Customer name=Karthik, member=true, memberType=Gold
customer name=Karthik, customer member=true, customer member type=Gold, date=Tue Jul 26 17:21:36 IST 2022, serviceExpense=90.0$, productExpense=50.0$
Total Expense of Karthik=121.5$
*/
