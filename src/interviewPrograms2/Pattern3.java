package interviewPrograms2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int row=0;row<n;row++)
		{
			for(int col=0;row+col<n-1;col++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
