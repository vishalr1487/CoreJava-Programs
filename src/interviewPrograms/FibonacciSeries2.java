package interviewPrograms;

import java.util.Scanner;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		
	/*	int k=0, a=1, b=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		
		System.out.print("1 1 ");
		while(k<=5) {
			k=a+b;
			if(k>=n)
				break;
			System.out.print(k+ " ");
			a=b;
			b=k;
		
		} */
		
		int x1=0, x2=1, x3, count=15;
		System.out.print(x1);
		
		
		for(int i=2; i<count; i++) {
			x3=x1+x2;
			System.out.print(" "+ x3);
			x1=x2;
			x2=x3;
			
		}
		
	
		
		

	}
	
	}
				



