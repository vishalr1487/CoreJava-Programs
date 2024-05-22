package arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] arr1= { 1, 3, 5, 7, 9, 11};
		int[] arr2= { 2, 4, 6, 8, 10, 12 };
		int[] merge= new int[arr1.length + arr2.length];
		
		
		int count=0;
		for(int i=0; i<arr1.length ; i++){
			merge[i] = arr1[i];
			count++;
		}
		for(int j=0; j<arr2.length; j++){
			merge[count++]=arr2[j];
		}
		for(int i=0; i<merge.length; i++){
			System.out.print(merge[i] + " ");
		}
	
	}

}
