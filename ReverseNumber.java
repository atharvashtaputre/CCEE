import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		
		System.out.println("Reverse of number : "+rev);

	}

}
