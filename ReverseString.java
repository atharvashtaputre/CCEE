import java.util.*;
class ReverseString {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String s2 = "";
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			s2=s2+ch;
			
		}
		System.out.println("Before : "+s);
		System.out.println("After : "+s2);
		
	}
}