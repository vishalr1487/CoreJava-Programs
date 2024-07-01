package interviewPrograms;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		
		int a[] = new int[] {4, 2, 1, 5, 3 };

		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				if (a[i] > a[j]) { // make ascending or descending < or >
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		System.out.println("Array after sorting : " + " " + Arrays.toString(a));

	}

}
