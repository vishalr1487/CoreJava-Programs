package interviewPrograms;

public class ReverseEachWordInString {
	
	public static void usingIterator() {
		String str = "Vishal from Raichur";

		int n = str.length();

		String RevStr = "";

		String[] words = str.split(" ");

		for (String w : words) {
			
			

			String ReverseWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				ReverseWord = ReverseWord + w.charAt(i);

			}
			RevStr = RevStr + ReverseWord + " ";

		}

		System.out.println(RevStr);
	}

	public static void main(String[] args) {

		usingIterator();

	}
	
	public static void usingIterator2() {
		
		
		String s1= "Hello world this is my first program";
		int n1= s1.length();
		String Reversastring= "";
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
