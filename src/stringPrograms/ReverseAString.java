package stringPrograms;

public class ReverseAString {

	public static void main(String[] args) {

		String str= "Vishal";
		
		/*int len= str.length();
		String revString= "";
		
		for(int i=len-1; i>=0; i--) {
			revString= revString + str.charAt(i);
		}
			
		System.out.println("Reversed String is : "+ revString); */
		
		
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	
	}

}
