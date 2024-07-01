package stringPrograms;

public class PalindromeString {

	public static void main(String[] args) {

		String str = "vndjuld";
		
		int i=0, j=str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println("Given string are not palindrome");
				System.exit(0);
				
			}
			i++;
			j--;
		}
		
		System.out.println("Given string are palindrome");
		
		
		
		
		
		
		
		
	}

}
