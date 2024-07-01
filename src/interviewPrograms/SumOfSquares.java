package interviewPrograms;

public class SumOfSquares {

	
	public static int SumOfSquares() {
		
		int sum=0;
		for(int i=10; i>=1; i--) {
			if(i%2!=0) {
				if(sum<(i*i)){
					sum=(i*i)-sum;
					
				}else {
					sum=sum-(i*i);
				}
			}else {
				sum=sum+(i*i);
			}
			
		}	
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("SumSquares =" + SumOfSquares() );
		
	}

}
