package stringPrograms;

public class PrintAtoZ {

	public static void main(String[] args) {
		
		// ASCII VALUES : A- Z [65-90]   .... // a-z [97-122]
		
		// 0-1 [48-57]
		
		char c;
		for(c='A'; c<='Z'; ++c) {
			System.out.print(c + " ");
		}
		
		System.out.println(" ");
		
		for(char c1='a'; c1<='z'; ++c1) {
			System.out.print(c1 + " ");
		}
		
		System.out.println(" ");
		
		for(int i=0; i<=10; i++) {
			System.out.print(i + " ");
		}

	}

}
