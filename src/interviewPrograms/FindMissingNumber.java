package interviewPrograms;

public class FindMissingNumber {

	public static void main(String[] args) {

		// Array should not contain duplicate elements
		// Array elements should be in range i.e., 1-5, 1-10, 1-20 36

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {

			sum1 = sum1 + a[i];
		}

		System.out.println("Sum of elements in an array 1 is: " + " " + sum1);

		int sum2 = 0;

		for (int i = 1; i <= 10; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Sum of elements in an array 2 is: " + " " + sum2);

		System.out.println("Missing number is :" + (sum2 - sum1));

	}

}
