package interviewPrograms;

public class ReverseAnInteger {

	public static void main(String[] args) {

		// using while loop

		int num = 12345;
		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10; // 0*10 + 12345/10 = 5
			num = num / 10;

		}

		System.out.println("Reverse number is " + rev);

		// using string buffer

		long num1 = 3456345;

		StringBuffer sb = new StringBuffer(String.valueOf(num1));

	}

}
