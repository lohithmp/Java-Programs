package Program_6_Oops;
// Abstract class for overriding implemented method(HOME_loan)
public abstract class Bank_loan    //Abstraction
{
	public void Home_loan()
	{
		System.out.println("Home loan applicable for only who's income below two lakh per annum");
	}
	//Using abstract method declaration for Car_loan method
	public abstract void Car_loan();
}
