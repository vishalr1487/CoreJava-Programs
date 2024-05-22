package interviewPrograms;

public class FactorialNumber {

	public static void main(String[] args) {

		// Factorial is a function that multiplies a number by every number below it.
		
		int num=5;
		
		long factorial= 1;
		
		for(int i=num; i>=1; i--) {
			
			factorial = factorial * i;
		}
		System.out.println("Factorial of a given number" + " " + num + " : " + factorial);
		
		
		
	}

}
