package stringPrograms;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		
		
		String str;
		int i, c , len;
		System.out.println("Enter the string to print all it's substrings");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		len= str.length();
		
		System.out.println("Substrings of \"" + str + "\" are : ");
		
		for(i=0; i<len ; i++) {
			for(c=1; c<=len-i; c++) {
				CharSequence sub = str.subSequence(i, i+c);
				System.out.println(sub);
			}
		}
	
	}

}
