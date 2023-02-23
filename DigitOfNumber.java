import java.util.Scanner;

public class DigitOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int count=0;
		int rev=0;
		while(n!=0) {
		    rem=n%10;
			n=n/10;
			count++;
			rev=rev*10+rem;
			System.out.println(" digits : "+rem);
			
		}
		System.out.println("Number of digits are : "+count);
		System.out.println(" Reverse of number : "+rev);

	}

}
