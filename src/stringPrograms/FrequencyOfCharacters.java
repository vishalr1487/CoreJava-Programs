package stringPrograms;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String str = "java is a programming language";
		char ch[] = str.toUpperCase().toCharArray();

		for (char c = 'A'; c < 'Z'; c++) {
			int count = 0;

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == c) {
					count++;
				}
			}

			if (count > 0) {

				System.out.println(c + " - " + count + " ");
			}

		}

		
		
	}

}
