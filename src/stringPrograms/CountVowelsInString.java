package stringPrograms;

public class CountVowelsInString {

	public static void main(String[] args) {

		String str= "Hello EveryOne";
		
		int Count=0;
		str=str.toLowerCase();
		
		for(int i=0; i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				
				Count++;
				
			}
		}
		
		System.out.println("Number of Vowels in the String are:" + Count);
		
		
	}

}
