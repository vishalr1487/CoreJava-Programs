package stringPrograms;


public class ReverseWordsInAString {

	public static void main(String[] args) {

		String str ="welcome to bengaluru and thankyou for visiting";
		String[] words = str.split("\\s");
		String revStr = "";
		
		for(int i=0; i<words.length; i++) {
			if(i==words.length-1) {
				revStr = words[i]+ revStr;
			}
			else {
				revStr = " " + words[i] + revStr ;
			}
		}

		System.out.println("Original String:" + str);
		System.out.println("Reversed String: " + revStr);
	}
}
