package stringPrograms;

public class CountVowelsInString {

	public static void main(String[] args) {

		String str = "SoftwareTestingInstitute";
		String str1 = str.toLowerCase();
		System.out.println(str1);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				
				count++;

			}

		}
		System.out.println("Total no: of vowels in the given string are : " + count);

	}

}
