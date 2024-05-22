package interviewPrograms;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= new int[] {13,8,0,9,56};
		
		int n=a.length;
		
		int temp;
		for(int i=0; i<a.length; i++) {
			for (int j=i; j<a.length; j++) {
				
				if( a[i]>a[j]) {         //    make ascending or descending     < or > 
				    temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			}
		}
		
		for(int ab: a)
		System.out.print(ab);

	}

}
