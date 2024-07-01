package interviewPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			int count = 0;
			for (int j = 1; j <= i; j++) { 		// 1<=5

				if (i % j == 0) { 		// 5%1==0    // modulus always returns the remainder of a division
					count++;
				}
			}

			if (count == 2) {
				System.out.print(i + " ");
			}

		}

	}

}
