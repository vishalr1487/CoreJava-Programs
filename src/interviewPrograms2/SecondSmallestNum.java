package interviewPrograms2;

public class SecondSmallestNum {

	public static void main(String[] args) {

		
		int arr[]= { 10,-20,-15,52,15,25,2};
		
		int firstmin=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<firstmin) {
				secondmin=firstmin;
				firstmin=arr[i];
				
			}else if(arr[i]<secondmin) {
				secondmin=arr[i];
			}
		}
		
		System.out.println("Second Largest Number is:" + secondmin);
		
	}

}
