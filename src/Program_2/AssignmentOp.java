package Program_2;

public class AssignmentOp {
	public static void main(String[] args) {
		int a=5;
		int b=9;
		System.out.println("b value is assigned to a; b:"+ (b=a));
		System.out.println("a+=b is adding a+b; a: "+(a+=b));
		System.out.println("a-=b a:"+ (a-=b));
		System.out.println("a*=b a:"+(a*=b));
		System.out.println("a/=b a:"+(a/=b));
		System.out.println("a%=b a:"+(a%=b));
	}

}
