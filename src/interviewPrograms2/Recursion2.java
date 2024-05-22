package interviewPrograms2;

public class Recursion2 
{

	public static void print1(int a) 
	{
		// TODO Auto-generated method stub
		
		if(a>1)
		{
			System.out.println(a+"");
			a--;
			print1(a);
		}
		
	}
	public static void print2(int a)
	{
		if(a<10)
		{
			System.out.println(a+"");
			a++;
			print2(a);
				
		}
	}
	public static void main(String[] args)
	{
		System.out.println("main method started");
		
		print1(9);
		print2(1);
		 
		System.out.println("main method ended");
		
	}

}
