package arrays;

import java.util.Arrays;

public class MoveAllZerosToLeftSide {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5 };
		int[] temp = new int[arr.length];
		int count = arr.length - 1; // ONLY CHANGE THESE 2 LINES: 'COUNT = ARR.LENGTH-1' AND 'COUNT--'

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp[count] = arr[i];
				count--;
			}
		}

		System.out.println(Arrays.toString(temp));

	}

}
