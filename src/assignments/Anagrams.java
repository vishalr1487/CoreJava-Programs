package assignments;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String a= "SILENT";
		String b= "LISTEN";
		 
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		Boolean result= Arrays.equals(c, d);
		if(result==true)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
	}

}
