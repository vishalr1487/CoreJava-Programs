package stringPrograms;

import java.util.Arrays;

public class Anagrams2 {
	
	public static void isAnagram(String s1, String s2) {
		

		if (s1.length() != s2.length()) {
			System.out.println("Given strings are not anagrams");
			//return false;
			
		} else {
			char c1[] = s1.toLowerCase().toCharArray();
			char c2[] = s2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			System.out.println("Given strings are anagrams");
			//return Arrays.equals(c1, c2);
			
			}
		
		
	}

	public static void main(String[] args) {
		String s1="SILENT";
		String s2 = "LISTEN";
		isAnagram("SILENT", "LISTEN");
		//System.out.println(isAnagram("SILENT", "LISTEN"));
	
		
	}

}
