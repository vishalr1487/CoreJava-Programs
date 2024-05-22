package stringPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = "Java   is   a   programming   langauge";
		System.out.println("Before removing spaces : " + str);

		 str = str.replaceAll("\\s", "");

		System.out.println("After removing spaces : " + str);

		
		
		
	}

}
