package stringPrograms;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "ABCDABCDABC";
		String result = " ";
		System.out.println("Original string : " + str);

		for (int i = 0; i < str.length(); i++) {
			String ch = " " + str.charAt(i); // converting char to string

			if (result.contains(ch)) {
				continue;
			}

			result = result + ch;

		}

		System.out.println("after removing duplicates" + result);

	}

}
