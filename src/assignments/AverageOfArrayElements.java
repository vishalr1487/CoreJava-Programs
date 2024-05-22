package assignments;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		
		int[] ar= new int[5];
		int[] b= { 50,60,77,88,99};
		 
		int sum=0;
		for(int i=0; i<b.length;i++)
		{
			sum=sum+b[i];
		}
		
		int avg=sum/b.length;
		System.out.println("The average value is :" + avg);
		System.out.println(sum);
	}

}
