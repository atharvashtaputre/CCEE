import java.util.*;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int count=0;
		int sum=0;
		while(n!=0) {
		    rem=n%10;
			n=n/10;
			count++;
			sum=sum+rem;
			System.out.println(" digits : "+rem);
			
		}
		System.out.println("Number of digits are : "+count);
		System.out.println(" Sum of digits : "+sum);

	}

}
