package interviewPrograms2;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		
		
		String s="I want to become a Data Analyst";
		String s1=" ";
		
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]!=' ') {
				s1=s1+ch[i];
				
				
			}
		}
		System.out.println(s1);
		
		
	}

}
