package stringPrograms;

public class ReverseIndividualWords {

	public static void main(String[] args) {

		String originalString = "JAVA IS A PROGRAMMING LANGUAGE";
		String[] words = originalString.split("\\s");
		
		String reversedString = " ";
		
		// here it should iterate till words.length .. not till originalString.length
		
		// here WORDS[] IS IN ARRAY SO WORDS[I]
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String revWord = " ";
			for(int j=word.length()-1; j>=0; j--) {
				
				// HERE WORD IS IN STRING SO charAt(j);
				revWord = revWord + word.charAt(j);   /// charAt(j) ....not I 
			}
			
			reversedString = reversedString + revWord + " ";
		}
		
		
		
		System.out.println("ORIGINAL STRING : " + originalString);
		System.out.println("REVERSED STRING : " + reversedString);
		
	}
	
}
