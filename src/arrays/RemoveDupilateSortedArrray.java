package arrays;

public class RemoveDupilateSortedArrray {

	// THIS METHOD IS FOR SORTED ARRAY

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9 };
		int[] temp = new int[arr.length]; // create a temporary array to store the duplicate values

		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {

				temp[count] = arr[i];
				count++;
			}

		}

		temp[count] = arr[arr.length - 1];
		System.out.print("{");

		for (int i = 0; i < temp.length; i++) {
			System.out.print(" " + temp[i] + " ");
		}

		System.out.println("}");

		// *************************************************
		//// WITHOUT USING TEMPORARY ARRAY ;; YOU CAN MODIFY IN THE GIVEN ARRAY ITSELF.

		/// GO FOR FIRST METHOD .... `

//		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 8 };
//
//		int j = 0;
//		for (int i=0; i<arr.length-1; i++) {
//			if (arr[i]!=arr[i + 1]) {
//				arr[j]=arr[i];
//				j++;
//			}
//		}
//
//		arr[j]=arr[arr.length-1];
//
//		for (int i=0; i<j; i++) { ////// if you write arr.length in place of 'j' ... then it will traverse till
//										////// length and repeat 8 8 8 at last
//			System.out.print(arr[i] + " ");
//		}

		// USING HASHSET

//		HashSet<Integer> hs = new HashSet<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			hs.add(arr[i]);
//		}
//
//		for (int number : hs) {
//			System.out.print(number + " ");
//		}

		//// USING ARRAYS CLASS TO SORT THEN APPLY SAME LOGIC
//		
//		Arrays.sort(arr);
//		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]!=arr[i+1]) {
//				arr[j]= arr[i];
//				j++;
//			}
//			
//			arr[j] = arr[arr.length-1];
//		}
//		
//		for(int i=0; i<=j; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

}
