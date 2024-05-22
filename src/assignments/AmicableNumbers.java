package assignments;

import java.util.Scanner;

public class AmicableNumbers {

	public static void main(String[] args)
	{
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1; i<n1; i++)
		{
			if(n1%i==0)
			{
				sum1=sum1+i;
			}
		}
		for(int i=1;i<n2;i++)
		{
			if(n2%i==0)
			{
				sum2=sum2+i;
			}
		}
		if(sum1==n2 && sum2==n1)
		{
			System.out.println(n1+" and "+n2+" are Amicable numbers");
		}
		else
		{
			System.out.print(n1+" and "+n2+ " are not Amicable numbers");
		}

	}

}
