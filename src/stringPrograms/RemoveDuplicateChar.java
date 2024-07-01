package stringPrograms;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "ABCDABCDABC";
		String result = " ";
		System.out.println("Original string : " + str);

		for (int i = 0; i < str.length(); i++) {
			String ch = "" + str.charAt(i); // converting char to string
			if (result.contains(ch)) {
				continue;
			}
			result = result+ch;
		}
		System.out.println("after removing duplicates:" + result);

		// ANOTHER APPROACH  --------------------------------------------------------------
		
		//System.out.println("Old String :" + str);
		//System.out.println("New String :" + removeDupliChar(str));
		
	}

	public static String removeDupliChar(String str) {
		
		String newStr = " ";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);    
			if (newStr.indexOf(ch) == -1) 
			{
				newStr = newStr + ch;
			}
		}
		return newStr;
	}
}
