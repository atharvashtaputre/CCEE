import java.util.*;
public class ILoveIndia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
		
		System.out.println("Enter the start of string to divide");
		int a= sc.nextInt();
		System.out.println("Enter the end of string to divide");
		int b= sc.nextInt();
		String sub = reverseString(str.substring(a, b));
		
		System.out.println("Enter the start of string to divide");
		a= sc.nextInt();
		System.out.println("Enter the end of string to divide");
		b= sc.nextInt();
		String sub2 = reverseString(str.substring(a, b));
		
		System.out.println("Enter the start of string to divide");
		a= sc.nextInt();
		System.out.println("Enter the end of string to divide");
		b= sc.nextInt();
		String sub3 = reverseString(str.substring(a, b));
		
       
        System.out.println("Final o/p: "+sub+" "+sub2+" "+sub3);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}