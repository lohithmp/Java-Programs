package Program_4;

public class Constructor 
{
	String student_Name;
	//parameterized Constructor
	public Constructor(String std)
	{
		student_Name=std;
	}
	//Zero Parameterized Constructor
	public Constructor()
	{
		System.out.println("Zero Parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Constructor obj_con=new Constructor("mahesh");
		Constructor obj1_con=new Constructor();
		System.out.println("Student name is:"+ obj_con.student_Name);
	}
	

}
