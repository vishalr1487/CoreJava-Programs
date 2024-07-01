package stringPrograms;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		
		String str;
		int i, j , len;
		System.out.println("Enter the string to print all it's substrings");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		len= str.length();
		
		System.out.println("Substrings of \"" + str + "\" are : ");
		
		for(i=0; i<len ; i++) {
			for(j=1; j<=len-i; j++) {
				CharSequence sub = str.substring(i, i+j);
				System.out.println(sub);
			}
		}
	
	}

}
