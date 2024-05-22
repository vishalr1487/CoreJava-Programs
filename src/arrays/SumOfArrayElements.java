package arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int[] ar=new int[8];
		
		//ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		ar[5]=60;  // in either way you can declare the array elements
		ar[6]=70;
		ar[7]=80;//
		
		int a[]= {10,20,30,40,50,60,70,80};
		  
		
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);

		
		}

	}


