package assignments;

public class MinAndMaxOfAnArray {
	
	public static int max(int[] array)
	{
		int max=0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		return max;
	}
		
	public static int min(int[] array)
	{
		int min=array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<min)
				{
					min=array[i];
				}

		}
		
		return min;
	}
		

	public static void main(String[] args) {
		
		int ar[]={23,96,87,99,45,21,18,9,8};
		MinAndMaxOfAnArray m=new MinAndMaxOfAnArray();
		System.out.println("Maximum value in the Array is:" + MinAndMaxOfAnArray.max(ar));
		System.out.println("Minimum value in the Array is:" + MinAndMaxOfAnArray.min(ar));
	}

}
