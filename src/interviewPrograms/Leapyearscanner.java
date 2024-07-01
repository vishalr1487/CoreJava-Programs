


package interviewPrograms;

import java.util.Scanner;

public class Leapyearscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		int year=sc.nextInt();
		boolean leap=false;
		if(year%400==0)
		{
			leap=true;
		}
		else if(year%4==0)
		{
			leap=true;
		}
		if (leap=true)
		{
			System.out.println("year+"+year+"is a leap year");
		}
		else
		{
			System.out.println("year"+year+"is not a leap year");
		}
		
		
	}

}
