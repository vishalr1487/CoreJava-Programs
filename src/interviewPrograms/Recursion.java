package interviewPrograms;

public class Recursion 
{

	public static void print(int a)
	{
		
		 if(a<=10)
		 {
			 System.out.println(a);
			 a++;
			 print(a);
		 }
		
	}
	public static void main(String[] args)
	{
		System.out.println("main method started");
		print(9);
		System.out.println("main method ended");
	}

}
