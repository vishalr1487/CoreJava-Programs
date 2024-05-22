package stringPrograms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String s1 = "SILENT";
		String s2 = "LISTEN";
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	

		for (int i = 0; i <ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				System.out.println("GIVEN STRINGS ARE NOT ANAGRAMS");
				System.exit(0);
			}
		}

		
		// SORT BOTHE THE STRINGS AND THEN ITERATE AND CHECK THE INDEX VALUES IF IT
		// MATCHES THEN ITS ANAGRAMS

		if (ch1.length != ch2.length) {
			System.out.println("Given strings are not ANAGRAMS");
			System.exit(0);
		} 
		
	}

}
