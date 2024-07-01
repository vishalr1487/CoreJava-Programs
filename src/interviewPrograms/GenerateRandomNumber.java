package interviewPrograms;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		Random ran = new Random();

		// random integers from 1 to 100

		for (int i = 0; i <= 100; i++) {
			System.out.print(ran.nextInt(100) + " ");

		}
		
		

	}

}
