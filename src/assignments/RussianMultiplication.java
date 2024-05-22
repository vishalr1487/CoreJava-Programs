package assignments;

public class RussianMultiplication {
	
	public static int multiply()
	{
		
		int a=10;
		int b=20;
		int result=0;
		
		while(a>0){
			if(a % 2!=0){
				result=result+b;
			
			}
			// If 'A' column is not an even number then adding 'B' column to result variable.
			a=(int)Math.ceil(a/2);
			b=b*2;
		}
		return result;
		
	}

	public static void main(String[] args) 
	{
		
	
		System.out.println("a*b=" + multiply());
	}

}
