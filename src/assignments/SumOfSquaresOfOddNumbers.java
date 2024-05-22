

package assignments; 

public class SumOfSquaresOfOddNumbers {

		public static int sumOfSquares()
		{
			int sum = 0;
			 for (int i=1; i<10; i=i+2) 
			  {
			   if(i % 3 == 0) {
			    sum = sum + (i* i);
			   }
			   else {
				   sum=0;
			   }
			 }
			return sum;
			
		}
	
	
		 public static void main(String[] args) {
			 
			 System.out.println("Sum of Squares of Odd Numbers:" + sumOfSquares() );
			 
			 }
	

	}


