package assignments;

public class SumOfAdjacentValues {
	
	
	
	public static void SumOfAdjacentValues(int[] ar){
		for(int i=0; i<ar.length-1; i++)
		{
			System.out.print(ar[i]+ar[i+1]);
			if(i<ar.length-2)
			{
				System.out.print(",");
			}
		
		}
		
		
	}

	public static void main(String[] args) 
	{
		int ar[]={4,5,3,4,5,6};
		SumOfAdjacentValues(ar);

	}

}
