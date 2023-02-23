import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		
		for(int i=2;i<=num/2;i++) 
		{
			if(num%i==0)
			{
				System.out.println(num+" is not prime number");
				return;
			}
		}

		System.out.println(num+" is prime number");
	}

}
