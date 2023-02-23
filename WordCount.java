import java.util.*;
class WordCount {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		int count = 1;
		for(int i=0; i<s.length(); i++) {
			char ch = ' ';
			if(s.charAt(i)==ch)
				count++;
		}
		System.out.println("Count of Words : "+count);
		
	}
}