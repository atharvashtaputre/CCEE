import java.util.*;

public class GcdofNumber {

	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=0;
		if(a<b)
		{
			n=a;
		}
		else 
			n=b;
		
		for(int i=n;i>0;i--)
		{
			if(a%n==0 && b%n==0) {
				break;
			}
		}
		System.out.println("GCD is "+ n);
		

	}

}
