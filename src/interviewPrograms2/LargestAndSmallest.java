package interviewPrograms2;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int numbers[]= { -10,24,50,-88,2};
		int largenum=numbers[0];
		int smallnum=numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largenum) {
				largenum=numbers[i];
			}else if(numbers[i]<smallnum) {
				smallnum=numbers[i];
			}
		}
		
		//System.out.println("Given Array is:" + numbers.toString(numbers));
		System.out.println("Largest number is:" + largenum);
		System.out.println("Smallest number is:" + smallnum);

	}

}
