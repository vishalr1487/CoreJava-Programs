package stringPrograms1;

public class OccuranceOfCharInString {
	
	
	public static void main(String[] args) {
		
		
		String s="Java Programming";
		
		int totalCount= s.length();
		
		int totalCountAfterRemoveA= s.replace("a", "").length();
		
		int Count= totalCount - totalCountAfterRemoveA;
		
		
		System.out.println("Occurance of A character is:" + Count);
		
		String s1="Java Python aabnhudfdfasd";
		int totalCount1=s1.length();
		int totalCountAfterRemoveALetter = s1.replace("a", "").length();
		int count = totalCount1 - totalCountAfterRemoveALetter;
		
		System.out.println(count);
		
	}

}
