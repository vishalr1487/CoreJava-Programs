package interviewPrograms;

public class SumAndAverage {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar=new int[6];
		int a[]= { 10,80,30,40,50,60};
		
		 
		 int sum=0;
		  for(int i=0;i<a.length;i++)
		  {
			 sum=sum+a[i]; 
		  }
		
		 int avg=sum/a.length;
		  System.out.println("The Average Value is:" + avg);
		  System.out.println(sum);
		  
		  int count=0;
		  for(int i=0;i<ar.length;i++)
		  {
			  if(a[i]>=35)
			  {
				count++;
			  }
			  
		  } 
		  
	
		System.out.println("Number of subjects fail="+ (ar.length-count));
		System.out.println("Number of subjects pass:" + count);
		  
		if(count>=4)
		{
			System.out.println("promoted");
			
		}
		else 
		{
			System.out.println("not promoted");
		}
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	
	

