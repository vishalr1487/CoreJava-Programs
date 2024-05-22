package stringPrograms;

public class OccuranceOfSingleChar {

	public static void main(String[] args) {

		String str = "JAva is A programming lAnguage";
		String str1 = str.toLowerCase();

		/// occurance of char ''

		int totalLength = str1.length();

		int totalLengthAfterRemove = str1.replace("a", "").length();

		int OccuranceOfChar = totalLength - totalLengthAfterRemove;
		System.out.println("Occurance of character " + "a" + " is " + OccuranceOfChar);

	}

}
