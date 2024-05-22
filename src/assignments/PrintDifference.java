package assignments;

public class PrintDifference {
	
	
	public static int printDifference()
	{
		
		 int sumOfSquare = 0;
		  int sumOfOne_Ten = (10 * 11) / 2;
		  
		  for (int i = 1; i <= 10; i++) 
		  {
		   sumOfSquare = sumOfSquare + (i*i);
		  }
		return ((sumOfOne_Ten * sumOfOne_Ten)-sumOfSquare) ;
		 
		
	}
		 
			
			  public static void main(String[] args) 
			  {
				  
				System.out.println("Difference is : " + printDifference() );
	
			  }
			

	}


