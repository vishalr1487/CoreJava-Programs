package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Vishal";

		String rev = " ";

		// using string concatinate method

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println("Reversed String is: " + rev);
		
		
		// using string buffer
		
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.reverse());
	}

}
