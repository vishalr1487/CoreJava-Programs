package interviewPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		
		int a[]= {2,3,4,5,6,7,8};
		
		int sum=0;
		
		for( int i=0; i<a.length; i++) {
			sum= sum + a[i];
		}
		
		System.out.println("Sum of elements in the given array is : " + " " + sum );
	}

}
