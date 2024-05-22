package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "SoftwareTestingBlog is a Testing Blog";
		System.out.println("Original String : " + str);
		int len=  str.length();
		String revStr = "";
		
		for(int i=len-1; i>=0; i--) {
			revStr= revStr + str.charAt(i);
		}
		
		System.out.println("Reversed String : " +  revStr );
		
		
		
		
		// Using StringBuffer Class
//		StringBuffer str1 = new StringBuffer(str);
//		System.out.println(str1.reverse());

		
		/// USING IF ELSE CONDITION
		
//		String str1 = "java is a programming language";
//		String[] words = str1.split("\\s");
//		String reversedString = " ";
//		
//		for(int i=0; i<words.length; i++) {
//			if(i==words.length-1) {
//				reversedString = words[i] + reversedString;
//			}
//			
//			else{
//				reversedString = " " + words[i] + reversedString;
//			}
//			
//			
//		}
//		
//		System.out.println("ReversedStirng : " + reversedString);
	
	}

}
