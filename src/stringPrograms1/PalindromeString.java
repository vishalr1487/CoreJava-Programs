package stringPrograms1;

public class PalindromeString {

	public static void main(String[] args) {

		
		String str="Vishal";
		//String org_str= str;
		
		String rev= " ";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev= rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
		
	}

}
