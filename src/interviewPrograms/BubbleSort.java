package interviewPrograms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 4, 2, 1, 5, 3 };

		System.out.println("Array before sorting : " + " " + Arrays.toString(a));

		int n = a.length;

		for (int i = 0; i < n; i++) {

			for (int j = 1; i < n - i; j++) {

				if (a[j - 1] > a[j]) {

					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}

		System.out.println("Array after sorting : " + " " + Arrays.toString(a));

	}

}
