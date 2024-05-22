package interviewPrograms2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

	/*	int num=1213;
		int sum=0;
		int rem=0;
		int temp = num;
		
		while(num>0) {
			rem=num%10; // to get the remainder
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("Given number is Palindrome");
		}else {
			System.out.println("Given number is not Palindrome");
		} */
		
		
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		 int num=sc.nextInt();
		 
		 StringBuffer sb=new StringBuffer(String.valueOf(num));
		 StringBuffer rev=sb.reverse();
		
		
		 System.out.println("Reverse Number is:" + rev);*/ 
		 
		 Scanner sc1= new Scanner(System.in);
		 System.out.println("Enter any number: " );
		 int num1= sc1.nextInt();
		 
		 StringBuffer sb1= new StringBuffer(String.valueOf(num1));
		 StringBuffer rev1= sb1.reverse();
		 
		 System.out.println("Rev num is :" + rev1);
		
	}	
}
