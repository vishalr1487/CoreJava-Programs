package stringPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		// 1st Approach : using for loop

		
		  String str = "Selenium with Java";
		 
		  String[] words = str.split(" ");
		 
		  String revString = " ";
		  
		  for (String w : words) {
		  
		  String revWord = " "; 
		  
		  for (int i = w.length() - 1; i >= 0; i--) {
		  
		  revWord = revWord + w.charAt(i);
		  
		  }
		  
		  revString = revString + revWord + " "; }
		  
		  System.out.println(revString);
		 

		//  2nd approach Using String Buffer

	/*	String str = "Vishal From Raichur";

		String[] words = str.split("\\s");

		String reverseWord = "";

		for (String w : words) {

			StringBuilder sb = new StringBuilder(w);
			sb.reverse();

			reverseWord = reverseWord + sb.toString() + " ";
		}
		System.out.println(reverseWord);  */

	}

}
