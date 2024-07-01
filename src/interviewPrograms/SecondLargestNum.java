package interviewPrograms;

public class SecondLargestNum {

	public static void main(String[] args) {
		
		int arr[]= {-10,0,20,25,89,-45};
		int first=0;
		int second=0;
		
		for(int i=1; i<arr.length; i++) {
			if(first<arr[i]) {
				second=first;
				first=arr[i];
			}
			else if(second<arr[i] && first!=arr[i]) {
				second=arr[i];
			}
		}
		
		
		
	
		 
		
		
		System.out.println("Second Largest Number is:" + second);
		


}
}