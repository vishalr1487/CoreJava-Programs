package interviewPrograms;

public class Swapping2Numbers {
	
	public static void main(String[] args) {

	
		int a=10, b=20;
		System.out.println("Before Swapping Numbers:" +a+ " "+ b);
		
		// Using temporary variable
	/*	int t=a;
		a=b;
		b=t;*/
		
		
		// Without Using temporary variable (+ and -)
		
		a=a+b;
		b=a-b;
		a=a-b; 
		
		
		// Using Multiply and Division Operator(* and /)
		
	/*	a=a*b;
		b=a/b;
		a=a/b; */
		
		// Using Single Statement
		
		//b=a+b-(a=b);
		
		// Using bitwise XOR(^)
		
	/*	a=a^b;
		b=a^b;
		a=a^b; */
		

		System.out.println("After Swapping Numbers:" +a+ " "+ b);
	}

}
