package interviewPrograms2;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {

		//int num=12345;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int num=sc.nextInt();
		int count=0;
		 
		while(num>0) {
			num=num/10;
			count++;
			
		}
		System.out.println("Number of digits present in this number is " + count);
		
		
		
	}

}
