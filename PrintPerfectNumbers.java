import java.util.*;

public class PrintPerfectNumbers {
	static boolean isPerfect(int n) {
		if(n==1)
			return false;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Perfect numbers between 1 to "+num);
		for(int n=1;n<=num;n++)
		{
			if(isPerfect(n))
			{
				System.out.println(n);
			}
		
		}
	}

}
