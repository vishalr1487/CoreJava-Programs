package interviewPrograms;

public class ReverseaString {

	public static void usingIterator() {

		// Reverse a string using toChar method

		String str ="Using toChar Method";
		int n = str.length();
		String revstr = "";
		for (int i = n - 1; i >= 0; i--) {

			revstr = revstr + str.charAt(i);

		}
		System.out.println(revstr);

	}

	public static void usingStringBuffer() {

		// using string buffer class

		String str1 = "Using String Buffer";
		StringBuffer sb = new StringBuffer(str1);
		System.out.println(sb.reverse());

	}

	public static void usingStringBuilder() {

		String s2 = "Using String Builder";
		StringBuilder sbud = new StringBuilder(s2);
		System.out.println(sbud.reverse());

	}
	

	public static void main(String[] args) {

		ReverseaString.usingIterator();
		ReverseaString.usingStringBuffer();
		ReverseaString.usingStringBuilder();

	}
}
