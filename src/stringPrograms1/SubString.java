package stringPrograms1;

public class SubString {

	public static void main(String[] args) {

		String str = "4562vishal45";
		System.out.println(str.substring(4, 10));

		str.toCharArray();
		char ch1 = 'a';
		char ch2 = 'z';

		int ascivalue1 = ch1;
		int ascivalue2 = ch2;

		System.out.println(ascivalue1);
		System.out.println(ascivalue2);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {

				System.out.print(str.charAt(i));
			}

		}

	}

}
