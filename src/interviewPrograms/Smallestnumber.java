package interviewPrograms;

public class Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]={56,78,-345,-56,7895};
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
			
			
		}
	
		System.out.println("largest="+ min);
	
	}

}
