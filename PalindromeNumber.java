import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int orignum=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(orignum==rev) {
			System.out.println(rev+" is palindrome number");
		}
		else
		System.out.println(rev+" is not palindrome number");
	}

}
