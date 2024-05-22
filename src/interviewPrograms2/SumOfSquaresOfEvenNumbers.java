package interviewPrograms2;

public class SumOfSquaresOfEvenNumbers {

	public static void main(String[] args) {

		
		int sum=0;
		
		for(int i=0; i<=10; i=i+2) {
			if(i%2==0) {
			
				sum=sum+(i*i);
				
				
			}
			
		}
		
		System.out.println("Sum of Squares of Even Numbers:" + sum);
		
	}

}
