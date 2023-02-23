import java.util.*;

public class PrimeFactorsOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Prime factors are ");
		for(int i=2;i<=num;i++) {
			while(num%i==0)
			{
				System.out.println(i+" ");
				num=num/i;
			}
		}

	}

}
