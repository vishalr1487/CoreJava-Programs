package stringPrograms1;

public class CountNoOfWords {

	public static void main(String[] args) {

		
		String str= "welcome to java";
		int len= str.length();
		
		int count=1;
		for(int i=0; i<str.length()-1; i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				
				count++;
			}
		}
		
		System.out.println("Number of words in this string are: " + count);
		
		
	}

}
