import java.util.*;
class StringSwap {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String s2 = sc.nextLine();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		s1=s1.concat(s2);
		s2=s1.substring(0,l1);
		s1=s1.substring(l1);
		
		System.out.println("String s1 : "+s1);
		System.out.println("String s2 : "+s2);
		
		
	}
}