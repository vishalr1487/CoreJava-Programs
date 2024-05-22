package interviewPrograms;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,786, 900};
		
		int max=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				
				max=a[i];  
			}
		}
		
		System.out.println("Msximum number in the given array is : " + " " + max);

		
		
	}

}
