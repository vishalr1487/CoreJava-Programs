package arrays;

import java.util.Arrays;

public class MoveAllZerosToRightSide {

	public static int[] moveZerosToRight(int[] arr) {
		int[] temp = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] != 0) {
				temp[count] = arr[i];
				count++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 2, 0, 3, 0, 4, 0, 5 };
		System.out.println(Arrays.toString(moveZerosToRight(arr)));
	}

}
