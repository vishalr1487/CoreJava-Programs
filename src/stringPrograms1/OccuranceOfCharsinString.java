package stringPrograms1;

public class OccuranceOfCharsinString {

	public static void main(String[] args) {

		
		String s= "vishal from raichur";
		
		int totalCount= s.length();
		
		int totalCount_AfterRemoveS= s.replace("i", "").length();
		
		int count= totalCount-totalCount_AfterRemoveS;
		
		System.out.println("Character 'i' has occured " +  count + " times");
		
		
		
		
	}

}
