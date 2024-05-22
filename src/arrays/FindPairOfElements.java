package arrays;

import java.util.Arrays;

public class FindPairOfElements {

	public static void findPair(int[] a, int target) {

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == target) {

					count++;
					//System.out.println("Total Count of pairs :"+  count);
					System.out.println( "{" + a[i] + "," + a[j] + "}");

				}

			}

		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 9,4,5,7,2,3,4,5,5,4,3,22,2,1 };

		int target = 10;

		findPair(a, target);

	}

}
