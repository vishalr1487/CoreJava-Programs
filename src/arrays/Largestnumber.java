package arrays;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]={56,78,-345,-56,7895};
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			
			
		}
	
		System.out.println("largest="+ max);
		
	}

}
