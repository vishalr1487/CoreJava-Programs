package interviewPrograms;

public class RevesreAstring {

	public static void main(String[] args) {

	// 1. Using STRING CONCATENATION method
		
		/*String str="Java is a programming language";
		String revstr= "";
		
		int len= str.length();
		for(int i=len-1; i>=0; i--) {
			revstr=revstr+ str.charAt(i);
		}
		
		System.out.println("Reverse String is:" + revstr); */
		
		
		
		// 2. USING CHARACTER ARRAY METHOD
		
	/*	String str="Java";
		String revstr= "";
		int len= str.length();
		char a[]= str.toCharArray();
		
		
		
		for(int i=len-1; i>=0; i--) {
			revstr= revstr+ a[i];
		}
		
		
		System.out.println("Reverse String is:" + revstr); */
		
		
		
		
		// 3. USING STRINGBUFFER CLASS
		
		/*String str="Java is a Programming Language";
		System.out.println("Before Reversing the String:" + str);
		
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer revstr=sb.reverse();
		System.out.println("After Revsering the String:" + revstr);*/
		
		
	}
	
}
