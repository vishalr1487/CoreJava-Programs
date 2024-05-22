package interviewPrograms2;

public class ReverseEachWordInAString {

	public static void main(String[] args) {

		String s="Java is a programming langauage";
		String revstring=" ";
		String[] words=s.split(" ");
		
		for(String w:words) {
			
			String revword="";
			for(int i=w.length()-1; i>=0; i--) {
				revword=revword+w.charAt(i);
			}
			revstring= revstring+revword+" ";
			
		}
		
		
		System.out.println(revstring);
		
		
	}

}
